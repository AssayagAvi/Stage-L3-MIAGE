import sys
import gurobipy as gp
from gurobipy import GRB

try : 
    #Création du model
    m = gp.Model("Pair")

    # Déclaration des Variables
    p = m.addVar(vtype=GRB.INTEGER, name="p")
    q = m.addVar(vtype=GRB.INTEGER, name="q")
    
    m.setObjective(0.5 - 0.5*p + 0.5*q, GRB.MAXIMIZE)

    # Contraintes des Variables
    m.addConstr(0.5 + 0.5*p +0.5*q ==1,"c1")
    m.addConstr(q >= 0,"c2")
    m.addConstr(p >=0,"c3")

    # Résoud la solution objective 
    m.optimize()

    for v in m.getVars():
        print('%s %d' % (v.varName, v.x))

    print('Obj: %s' % m.objVal)

except gp.GurobiError as e:
    print('Error code ' + str(e.errno) + ': ' + str(e))

except AttributeError:
    print('Encountered an attribute error')    