# function to remove duplicates from sorted array of numbers in place

def remove_duplicates(nums)
    return 0 if nums.length == 0
    unique = 1
    while unique != nums.length
        if nums[unique] == nums[unique - 1]
            nums.delete_at(unique)
        else
            unique += 1
        end
    end
    return unique
end


remove_duplicates([0,0,1,1,1,2,2,3,3,4])