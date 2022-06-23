import QuickSort.QuickSort;

public class PokemonGo {
            private String bug;
            private String dark;
            private String dragon;
            private String electric;
            private String fairy;
            private String fighting;
            private String fire;
            private String flying;
            private String ghost;
            private String grass;
            private String ground;
            private String ice;
            private String normal;
            private String poison;
            private String psychic;
            private String rock;
            private String steel;
            private String water;


            public PokemonGo{
            }

            public PokemonGo (String bug, String dark, String dragon, String electric, String fairy, String fighting,
                              String fire, String flying, String ghost, String grass, String ground, String ice, String
                              normal, String poison, String psychic, String rock, String steel, String water){
                this.bug = bug;
                this.dark = dark;
                this.dragon = dragon;
                this.electric = electric;
                this.fairy = fairy;
                this.fighting = fighting;
                this.fire = fire;
                this.flying = flying;
                this.ghost = ghost;
                this.grass = grass;
                this.ground = ground;
                this.ice = ice;
                this.normal = normal;
                this.poison = poison;
                this.psychic = psychic;
                this.rock = rock;
                this.steel = steel;
                this.water = water;
            }

            public static void main(String[] args) {
                int[] dataArray = {13,18,27,2,19,25};
                int s = dataArray.length;
                System.out.println("""
                        Before sorting array elemnts are -\s""");
                QuickSort _myQS = new QuickSort();
                _myQS.setData(dataArray);
                _myQS.printArr(n);
                _myQS.quickSort(0,n - 1);
                System.out.println("\n After sorting array element are - ");
                _myQS.printArr(n);
                System.out.println();
            }

    }


        }


