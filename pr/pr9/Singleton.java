package pr.pr9;

public class Singleton {

    public static class AppSettings {
        private static AppSettings instance;
        private String theme;
        private int fontSize;
        private boolean notificationsEnabled;

        private AppSettings() {
            this.theme = "Светлая";
            this.fontSize = 12;
            this.notificationsEnabled = true;
        }

        public static AppSettings getInstance() {
            if (instance == null) {
                instance = new AppSettings();
            }
            return instance;
        }

        public String getTheme() {
            return theme;
        }

        public void setTheme(String theme) {
            this.theme = theme;
        }

        public int getFontSize() {
            return fontSize;
        }

        public void setFontSize(int fontSize) {
            this.fontSize = fontSize;
        }

        public boolean isNotificationsEnabled() {
            return notificationsEnabled;
        }

        public void setNotificationsEnabled(boolean notificationsEnabled) {
            this.notificationsEnabled = notificationsEnabled;
        }
    }
}
