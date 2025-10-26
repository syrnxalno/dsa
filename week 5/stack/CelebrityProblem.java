import java.util.Stack;
public class CelebrityProblem {
    
    // brute force approach
    static int celebrity(int arr[][]){
        int n = arr.length;
        int indegree[] = new int[n]; // candidates that know 'i'
        int outdegree[] = new int[n]; // candidates 'i' knows

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int x = arr[i][j];

                outdegree[i] += x;
                indegree[j]  += x;
            }
        }

        for(int i=0;i<n;i++){
            if(outdegree[i]==0 && indegree[i]==n-1){ // if 'i' knows no one & if everyone(except 'i') knows 'i'
                return i;
            }
        }
        return -1;
    }

    // using a stack
    static int findCelebrity(int arr[][]){
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<arr.length;i++){
            stack.push(i);
        }

        while(stack.size()>1){
            // pick two candidates
            int a = stack.pop();
            int b = stack.pop();

            // if 'a' knows 'b' -> 'a' is not a celebrity, ∴ 'b' could be be a potential candidate
            if(arr[a][b]==1){
                stack.push(b);
            }else{
            // vice versa
                stack.push(a);
            }
        }

        int candidate = stack.pop();

        // verifying if candidate is legit
        for(int i=0;i<arr.length;i++){
            if(i!=candidate){
                if(arr[candidate][i]==1 || arr[i][candidate]==0){
                    return -1;
                }
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int arr[][] = {{0, 1, 0},{0,0,0},{0,1,0}};
        System.out.println("The celebrity is :"+findCelebrity(arr));
    }
}
