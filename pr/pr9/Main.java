package pr.pr9;

public class Main {
    public static void main(String[] args) {

        Singleton.AppSettings settings = Singleton.AppSettings.getInstance();

        System.out.println("Текущие настройки:");
        System.out.println("Тема: " + settings.getTheme());
        System.out.println("Размер шрифта: " + settings.getFontSize());
        System.out.println("Уведомления включены: " + settings.isNotificationsEnabled());

        settings.setTheme("Тёмная");
        settings.setFontSize(14);
        settings.setNotificationsEnabled(false);

        System.out.println("Обновлённые настройки:");
        System.out.println("Тема: " + settings.getTheme());
        System.out.println("Размер шрифта: " + settings.getFontSize());
        System.out.println("Уведомления включены: " + settings.isNotificationsEnabled());

        Singleton.AppSettings anotherSettingsInstance = Singleton.AppSettings.getInstance();
        System.out.println("Один и тот же экземпляр? " + (settings == anotherSettingsInstance));
    }
}
