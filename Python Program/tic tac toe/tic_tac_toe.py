
import numpy
board=numpy.array([["_","_","_"],["_","_","_"],["_","_","_"]])
p1s="X"
p2s="O"
print("Hello, play this 'Tic Tac Toe' Game")
print("If you want to quit game anytime, press 0 as input in row or column.")
a=0

def bold(l,symbol,target):
    b=0
    while b<=4:
        board[l[b]][l[b+1]]=target
        b+=2
        
def append_(l,r,j):
    l.append(r)
    l.append(j)
    
def check_r(symbol,player):
    for r in range(3):
        l=[]
        count=0
        for j in range(3):
            if board[r][j]==symbol:
                count+=1
                append_(l,r,j)
        if count==3:
            bold(l,symbol,"-")
            print(player,"won !")
            return True
    return False

def check_c(symbol,player):
    for j in range(3):
        l=[]
        count=0
        for r in range(3):
            if board[r][j]==symbol:
                count+=1
                append_(l,r,j)
        if count==3:
            bold(l,symbol,"|")
            print(player,"won !")
            return True

def check_d(symbol,player):
    count=count1=0
    l=[]
    m=[]
    for i in range(3):
        if board[i][i]==symbol:
            count+=1
            append_(l,i,i)
            if board[i][2-i]==symbol:
                count1+=1
                append_(m,i,2-i)
        elif board[i][2-i]==symbol:
            count1+=1
            append_(m,i,2-i)
    if count==3:
        bold(l,symbol,"\\")
        print(player,"won !")
        return True
    elif count1==3:
        bold(m,symbol,"/")
        print(player,"won !")
        return True
    else:
        return False


def won(symbol,player):
    return check_r(symbol,player) or check_c(symbol,player) or check_d(symbol,player)

def place(symbol):
    print(numpy.matrix(board))
    while 1:
        try:
            row=int(input("Enter row position: "))
            if row==0:
                return False
                break
            col=int(input("Enter column position: "))
            if col==0:
                return False
                break
            elif row<=3 and col<=3 and row>0 and col>0 and board[row-1][col-1]=="_":
                break
            else:
                print("Invalid input, please enter again")
        except:
            print("Invalid input, please enter again")
    board[row-1][col-1]=symbol

def play(p1,p2):
    flag=0
    for turn in range(9):
        if turn%2==0:
            print(p1,", your turn")
            if place(p1s)==False:
                flag=1
                break
            else:
                if won(p1s,p1):
                    print(numpy.matrix(board))
                    break
        else:
            print(p2,", your turn")
            if place(p2s)==False:
                flag=1
                break
            else:
                if won(p2s,p2):
                    
                    print(numpy.matrix(board))
                    break
    if turn==8:
        print("Match is Draw ...")
    if flag==1:
        print("Okay !, Thank you...bye")
while a<3:
    name1=input("Enter player 1 name: ")
    name2=input("Enter player 2 name: ")
    if name1=="" or name2=="":
        print("Please enter valid names")
        a+=1
        continue
    else:
        play(name1,name2)
        break
else:
    print("You have exceeded limits....")