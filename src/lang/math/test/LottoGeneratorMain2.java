package lang.math.test;

public class LottoGeneratorMain2 {
    public static void main(String[] args) {
        LottoGenerator2 generator = new LottoGenerator2();

        int[] lottoNumbers = generator.generate();

        // 생성된 로또 번호 출력
        System.out.print("로또 번호: ");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }

    }
}
