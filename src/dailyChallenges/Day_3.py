

#TODO: do time complexity analysis, optimize in a separate folder

# Given a string, s, find the longest palindromic substring in s.

def longest_palindromic(stri):
    lp = ""
    i = 0
    while i < len(stri):
        j = len(stri)-1
        print(stri[i] + "||" + "i: " + str(i) + "||" + str(stri.count(stri[i]) > 1))
        if stri.count(stri[i]) > 1:
            while j > 0:
                print("j: " + str(j) + "character i: " + stri[i] + " character j: " + stri[j])
                if stri[i] == stri[j]:
                    ii = i + 1
                    jj = j - 1
                    t = True
                    while ii < jj:
                        print("!!!! jj: " + str(jj) + "ii: " + str(ii) + "character i: " + stri[ii] + " character j: " + stri[jj])
                        print(stri[ii] == stri[jj])
                        if stri[ii] == stri[jj]:
                            ii = ii + 1
                            jj = jj - 1
                        else:
                            t = False
                            ii = jj
                    if t and len(stri[i:j]) >= len(lp):
                        lp = stri[i:j+1]
                        print(lp)
                j = j - 1
        i = i + 1
    print(lp)


if __name__ == '__main__':
    longest_palindromic("lasdmlaskmdahahhahadsadasd")
