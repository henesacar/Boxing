public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    double coin;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.coin = 0.0;
    }

    boolean checkWeight() {
        return (f1.weight >= this.minWeight && f1.weight <= this.maxWeight && f2.weight >= this.minWeight && f2.weight <= this.maxWeight);

    }

    public void run() {
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                if (coinToss() <= 50) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    score();
                } else {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }
            }}
        else{
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }}

            void score () {
                System.out.println("-------------");
                System.out.println(f1.name + " kalan can: " + f1.health);
                System.out.println(f2.name + " kalan can: " + f2.health);
            }

            boolean isWin () {
                if (f1.health == 0) {
                    System.out.println("Maçın galibi: " + f2.name);
                    return true;
                }
                if (f2.health == 0) {
                    System.out.println("Maçın galibi: " + f1.name);
                    return true;
                }
                return false;
            }
            double coinToss () {
                this.coin = Math.random() * 100;
                return this.coin;

            }
        }
