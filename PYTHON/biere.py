"""
Maximiser  : 15 X1 + 25 X2                  Soultion : X1 = 12 et X2 = 28

Contraintes :
C1 = 2.5 X1  + 7.5 X2 <= 240 (Mais)          C2 = 0.125 X1 + 0.125 X2 <= 5 (Houblon)

C3 = 17.5 X1 + 10 X2 <= 595                  Positivité : X1 > 0 et X2 > 0 
"""
import gurobipy as gp
from gurobipy import *

try : 
    #Création du model
    m = gp.Model("Biere")

    # Déclaration des Variables
    x1 = m.addVar(vtype=GRB.INTEGER, name="x1")
    x2 = m.addVar(vtype=GRB.INTEGER, name="x2")
   
    m.setObjective(15*x1 + 25*x2, GRB.MAXIMIZE)

    # Contraintes des Variables
    m.addConstr(2.5 * x1 + 7.5 * x2 <= 240, "c1")
    m.addConstr(0.125 * x1 + 0.125 * x2 <= 5, "c2")
    m.addConstr(17.5 * x1 + 10 * x2 <= 595, "c3")
   
    # Résoud la solution objective 
    m.optimize()

    for v in m.getVars():
        print('%s %d' % (v.varName, v.x))

    print('Obj: %s' % m.objVal)

except gp.GurobiError as e:
    print('Error code ' + str(e.errno) + ': ' + str(e))

except AttributeError:
    print('Encountered an attribute error')    