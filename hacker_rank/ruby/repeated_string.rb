#https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
# Complete the repeatedString function below.
def repeatedString(s, n)
    singleOccurence = s.count('a')
    fullOccurences = n / s.length * singleOccurence 
    leftOver = s.slice(0, n % s.length).count('a')
    occurences = fullOccurences + leftOver
    return occurences
end
