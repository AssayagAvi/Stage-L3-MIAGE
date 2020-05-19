import gurobipy as gp
import sys
from gurobipy import GRB



try :
    # Creation Model
    m=gp.Model("Exercice_1")

    # Decalration Variable
    x1 = m.addVar(vtype=GRB.INTEGER, name="x1")
    x2 = m.addVar(vtype=GRB.INTEGER, name="x2")
    hs = m.addVar(vtype=GRB.INTEGER, name="hs")
    mp = m.addVar(vtype=GRB.INTEGER, name="mp")
    p1 = m.addVar(vtype=GRB.INTEGER, name="p1")
    p2 = m.addVar(vtype=GRB.INTEGER, name="p2")

    # Maiximisation
    m.setObjective(15*x1 +8*x2 -(6*hs +1.5*mp + p1 + p2) ,GRB.MAXIMIZE)

    # Ajout des contraintes
    m.addConstr(1.5 * x1 + 0.8 * x2 <= 320, "c1")
    m.addConstr(0.75 *x1 + 0.5*x2 - hs <=140, "c2")
    m.addConstr(2 * x1 + x2 -mp <= 0, "c3")
    m.addConstr(mp <= 400, "c4")
    m.addConstr(p1 + p2 <= 100, "c5")
    m.addConstr(x1 -10*p1 <= 50, "c6")
    m.addConstr(x2 -15*p2 <= 60, "c7")
    m.addConstr(2.5 * x1 + 7.5 * x2 <= 240, "c1")


    # Résolution
    m.optimize()

    for v in m.getVars():
        print('%s %d' % (v.varName, v.x))

    print('Obj: %s' % m.objVal)

except gp.GurobiError as e:
    print('Error code ' + str(e.errno) + ': ' + str(e))

except AttributeError:
    print('Encountered an attribute error')    