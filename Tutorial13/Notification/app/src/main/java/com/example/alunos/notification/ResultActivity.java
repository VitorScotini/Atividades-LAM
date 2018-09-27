package com.example.alunos.notification;

class ResultActivity {

    Intent resultIntent = new Intent(this, ResultActivity.class);
    PendingIntent resultPendingIntent = TaskStackBuilder.create(this)
            .addNextIntentWithParentStack(resultIntent)
            .getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);

}
