import gurobipy as gp
import sys
from gurobipy import GRB


try :
    mp = gp.Model("Matching Pennies")
    p = mp.addVar(vtype=GRB.INTEGER, name="p")
    q = mp.addVar(vtype=GRB.INTEGER, name="q")


    mp.addConstr(p * q >= 0, name="c1")
    mp.addConstr(p*(q-1) >= 0, name="c2")
    mp.addConstr(q*(p-1) >= 0, name="c3")
    mp.addConstr((1-p)*(1-q) >= 0, name="c4")
  #  mp.addConstr(4*p*q -2*p -2*q +1,GRB.EQUAL,1,name="c5")

    
    mp.setObjective(4*p*q -2*p -2*q +1, GRB.MAXIMISE)

    mp.optimize()

    for v in mp.getVar():
       print('%s %d' % (v.varName, v.x))

    print('Obj: %s' % mp.objVal)

except gp.GurobiError as e:
    print('Error code ' + str(e.errno) + ': ' + str(e))

except AttributeError:
    print('Encountered an attribute error')    