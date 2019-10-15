

def countingValleys(n, s)
    valleys = 0
    steps = 0
    position = 0

    until steps === n
        puts "steps #{steps}"
        puts "position #{position}"
        if s[steps] == 'U'
            position += 1
        else
            position -= 1
        end

        if position == 0 && s[steps] === 'U'
            valleys += 1
            puts "valley at #{position} at step #{steps}"
        end
        steps += 1
    end
    puts valleys
end
countingValleys(8, 'UDDDUDUU')