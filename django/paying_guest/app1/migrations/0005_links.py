# Generated by Django 3.2.7 on 2021-11-18 08:11

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('app1', '0004_database'),
    ]

    operations = [
        migrations.CreateModel(
            name='links',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('link', models.URLField(max_length=30)),
                ('name', models.CharField(max_length=20)),
            ],
        ),
    ]
