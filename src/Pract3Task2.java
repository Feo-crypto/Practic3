public class Pract3Task2 {

    public static class Human{
        protected int MaxHealth=100;
        protected int Health;

        public Human(){
            setHealth(MaxHealth);
        }

        protected class Limb{
            protected int MaxHealth=100;
            protected int Health=0;
            protected boolean Crippled;
            protected void Set(){
                Health=MaxHealth;
                Crippled=false;
                CheckHealth();
            }
            protected void CheckHealth(){
                if(Health<=0){
                    Crippled=true;
                }
            }

            public void UseDoctorsBag(){
                Health=MaxHealth;
                Crippled=false;
            }

            public void setHealth(int health) {
                Health = health;
                CheckHealth();
            }

            public int getHealth() {
                return Health;
            }

            public void setCrippled(boolean crippled) {
                Crippled = crippled;
            }

            public void setMaxHealth(int maxHealth) {
                MaxHealth = maxHealth;
            }

            public int getMaxHealth() {
                return MaxHealth;
            }
            public String Status() {
                return "Limb{" +
                        "MaxHealth=" + MaxHealth +
                        "/Health=" + Health +
                        ", Crippled=" + Crippled +
                        "}\n";
            }
        }

        public void setMaxHealth(int maxHealth) {
            MaxHealth = maxHealth;
        }

        public void setHealth(int health) {
            Health = health;
        }

        class Head extends Limb{
            public String Status() {
            return "Head{" +
                    "MaxHealth=" + MaxHealth +
                    "/Health=" + Health +
                    ", Crippled=" + Crippled +
                    "}\n";
        }
        }
        class Torso extends Limb{
            public String Status() {
            return "Torso{" +
                    "MaxHealth=" + MaxHealth +
                    "/Health=" + Health +
                    ", Crippled=" + Crippled +
                    "}\n";
        }
        }
        class RightArm extends Limb{
            public String Status() {
            return "RightArm{" +
                    "MaxHealth=" + MaxHealth +
                    "/Health=" + Health +
                    ", Crippled=" + Crippled +
                    "}\n";
        }
        }
        class LeftArm extends Limb{
            public String Status() {
            return "LeftArm{" +
                    "MaxHealth=" + MaxHealth +
                    "/Health=" + Health +
                    ", Crippled=" + Crippled +
                    "}\n";
        }
        }
        class RightLeg extends Limb{
            public String Status() {
            return "RightLeg{" +
                    "MaxHealth=" + MaxHealth +
                    "/Health=" + Health +
                    ", Crippled=" + Crippled +
                    "}\n";
        }
        }
        class LeftLeg extends Limb{
            public String Status() {
            return "LeftLeg{" +
                    "MaxHealth=" + MaxHealth +
                    "/Health=" + Health +
                    ", Crippled=" + Crippled +
                    "}\n";
        }
        }

        public Head theHead=new Head();
        public Torso theTorso=new Torso();
        public RightArm theRightArm=new RightArm();
        public LeftArm theLeftArm=new LeftArm();
        public RightLeg theRightLeg=new RightLeg();
        public LeftLeg theLeftLeg=new LeftLeg();

        public void SetLimbs(){
            theHead.Set();
            theLeftArm.Set();
            theRightArm.Set();
            theLeftLeg.Set();
            theRightLeg.Set();
            theTorso.Set();
        }

        public void useDoctorsBag(){
            theHead.UseDoctorsBag();
            theLeftArm.UseDoctorsBag();
            theRightArm.UseDoctorsBag();
            theLeftLeg.UseDoctorsBag();
            theRightLeg.UseDoctorsBag();
            theTorso.UseDoctorsBag();
        }
        public String FullStatus(){
            return "{MaxHealth=" + MaxHealth +
                    "/Health=" + Health+"}\n"+theHead.Status()+theTorso.Status()+theRightLeg.Status()+
                    theLeftLeg.Status()+theRightArm.Status()+theLeftArm.Status();
        }

    }


    public static void main(String[] args) {
        Human Giorno=new Human();
        Giorno.SetLimbs();
        System.out.println(Giorno.FullStatus());
        Giorno.theHead.setHealth(0);
        System.out.println(Giorno.FullStatus());
        Giorno.useDoctorsBag();
        System.out.println(Giorno.FullStatus());
    }
}
