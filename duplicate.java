static void removeDuplicate()
    {
        int array[] = {1,2,3,4,5,6,7,2,3,4,1};
        int finalArray[] = new int[array.length];

        int index = 0;
        for(int i=0;i<array.length;i++)
        {
            boolean duplicate = false;
            for(int j=0;j<i;j++)
            {
                if(array[i] == array[j])
                {
                    duplicate = true;
                    break;
                }
                
            }
            if(!duplicate)
            {
                finalArray[index++] = array[i];
            }
        }

        System.out.println("Before : "+Arrays.toString(array));
        System.out.println("After : "+Arrays.toString(finalArray));
    }