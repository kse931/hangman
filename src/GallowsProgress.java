public enum GallowsProgress {
    FIRST{
        public String toString() {
            return "5 tries left"; // здесь вместо tries left надо рисовать виселицу в консоли но мне пиздец как впадлу
        }
    },
    SECOND{
        public String toString() {
            return "4 tries left";
        }
    },
    THIRD{
        public String toString() {
            return "3 tries left";
        }
    },
    FOURTH{
        public String toString() {
            return "2 tries left";
        }
    },
    FIFTH{
        public String toString() {
            return "1 try left";
        }
    },
    LAST{
        public String toString() {
            return "gabella:(";
        }
    };

    static String showState(int mistakes) {
        switch (mistakes) {
            case 1:
                return FIRST.toString();
            case 2:
                return SECOND.toString();
            case 3:
                return THIRD.toString();
            case 4:
                return FOURTH.toString();
            case 5:
                return FIFTH.toString();
            case 6:
                return LAST.toString();
            default:
                return "";
        }
    }
}
