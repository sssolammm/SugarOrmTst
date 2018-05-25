
**SugarOrm basic example**

If your device is Xiaomi and you have this error INSTALL_CANCELED_BY_USER:

 - Go to Settings -> Permissions -> Install via USB: Uncheck your App if it's listed.
 - Go to Settings -> Additional Settings -> Privacy: Check the Unknown Sources option.
 - **Finally go to Settings -> Additional Settings -> Developer options: Check the Install via USB option.**


Known Issues.
1. Instant Run.
Instant-Run seems to prevent Sugar ORM from finding the "table" classes, therefore it cannot create the DB tables if you run the app for the first time

When running your app for the first time Turn off Instant run once to allow for the DB tables to be created You can enable it after the tables have been created.

To disable Instant-Run in Android Studio:

(Preferences (Mac) or Settings (PC) -> Build, Execution, Deployment -> Instant Run -> Untick "Enable Instant Run..." )
