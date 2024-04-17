package RunTest;

import java.util.Random;
import java.util.HashMap;


public class tt {
    public int[] twoSum(int[] nums, int target) {
        // Tạo một HashMap để lưu trữ giá trị và vị trí của các phần tử trong mảng
        HashMap<Integer, Integer> map = new HashMap<>();

        // Duyệt qua mảng
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Kiểm tra xem phần tử hiện tại có tồn tại trong HashMap không
            if (map.containsKey(complement)) {
                // Nếu có, trả về một mảng chứa vị trí của phần tử và phần tử cần tìm
                return new int[]{map.get(complement), i};
            }
            // Nếu không, thêm phần tử và vị trí của nó vào HashMap
            map.put(nums[i], i);
        }
        // Trả về một mảng rỗng nếu không tìm thấy kết quả
        return new int[0];
    }

    public static void main(String[] args) {
        tt twoSum = new tt();
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
