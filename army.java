//추상클래스 군대
abstract class Military{
    String Name;

    public abstract void salute();
    public abstract void Bokmushinjo();
}

//육군-추상클래스로부터 상속받음
class army extends Military{             

    army(){
        Name="육군";
    }

    public void salute(){
        System.out.println("충성!");
    }

    public void Bokmushinjo(){
        System.out.println("하나. 우리는 자유민주주의를 수호하며 조국통일의 역군이 된다.\n"+"둘. 우리는 실전과 같은 훈련으로 지상전의 승리자가 된다.\n"+"셋. 우리는 법규를 준수하고 상관의 명령에 복종한다.\n"+"넷. 우리는 명예와 신의를 지키며 전우애로 굳게 단결한다.\n");
    }

}

//해군
class navy extends Military{
    navy(){
        Name = "해군";
    }

    public void salute(){
        System.out.println("필승!");
    }

    public void Bokmushinjo(){
        System.out.println("하나. 명령에 죽고사는 해군이 되자.\n"+"하나. 책임을 완수하는 해군이 되자.\n"+"하나. 전기를 갈고닦는 해군이 되자.\n"+"하나. 전우애로 뭉쳐진 해군이 되자.\n"+"하나. 싸우면 이기는 해군이 되자.\n");
    }
}

//공군
class airForce extends Military{
    airForce(){
        Name = "공군";
    }

    public void salute(){
        System.out.println("필승!");
    }

    public void Bokmushinjo(){
        System.out.println("첫째, 전쟁을 억제하고\n"+"둘째, 영공을 방위하며\n"+"셋째, 전쟁에서 승리하고\n"+"넷째, 국익증진과 세계평화에 기여한다.\n");
    }    
}

class Main {
    public static void main(String[] args) {

        System.out.println("군대 꿀팁 대방출! 부대별 경례방식과 복무신조!");
        //객체 생성
        army a = new army();
        navy n = new navy();
        airForce f = new airForce();

        //육군 결과 출력
        System.out.println(a.Name);
        a.salute();
        a.Bokmushinjo();

        //해군 결과 출력
        System.out.println(n.Name);
        n.salute();
        n.Bokmushinjo();

        //공군 결과 출력
        System.out.println(f.Name);
        f.salute();
        f.Bokmushinjo();

    }
}

