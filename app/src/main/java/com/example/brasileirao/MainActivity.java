package com.example.brasileirao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreGoalCor = 0;  int scoreKickGCor = 0;
    int scoreKickCor = 0;  int scoreFaultsCor = 0;
    int scoreYCCor = 0;    int scoreRCCor = 0;
    int scoreGoalPal = 0;  int scoreKickGPal = 0;
    int scoreKickPal = 0;  int scoreFaultsPal = 0;
    int scoreYCPal = 0;    int scoreRCPal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayGoalCorinthians(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corinthians_goals_score);
        scoreView.setText(String.valueOf(score));
    }
    public void Goal_corinthians (View view){
        scoreGoalCor = scoreGoalCor + 1;
        displayGoalCorinthians(scoreGoalCor);
    }
    public void displayKickCorinthians(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Score_kicks_cor);
        scoreView.setText(String.valueOf(score));
    }
    public void kicks_cor(View view){
        scoreKickCor = scoreKickCor + 1;
        displayKickCorinthians(scoreKickCor);
    }
    public void displayKickGCorinthians(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Score_g_kicks_cor);
        scoreView.setText(String.valueOf(score));
    }
    public void Goal_Kicks_cor(View view){
        scoreKickGCor = scoreKickGCor + 1;
        displayKickGCorinthians(scoreKickGCor);
    }
    public void displayFaultsCorinthians(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Score_faults_cor);
        scoreView.setText(String.valueOf(score));
    }
    public void faults_cor(View view){
        scoreFaultsCor = scoreFaultsCor + 1;
        displayFaultsCorinthians(scoreFaultsCor);
    }
    public void displayYCCorinthians(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Score_yc_cor);
        scoreView.setText(String.valueOf(score));
    }
    public void yellow_cards_cor(View view){
        scoreYCCor = scoreYCCor + 1;
        displayYCCorinthians(scoreYCCor);
    }
    public void displayRCCorinthians(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Score_rc_cor);
        scoreView.setText(String.valueOf(score));
    }
    public void Red_cards_cor(View view){
        scoreRCCor = scoreRCCor + 1;
        displayRCCorinthians(scoreRCCor);
    }

    public void Reset(View view){
        scoreGoalCor = 0;  scoreKickGCor = 0;
        scoreKickCor = 0;  scoreFaultsCor = 0;
        scoreYCCor = 0;    scoreRCCor = 0;
        scoreGoalPal = 0;  scoreKickGPal = 0;
        scoreKickPal = 0;  scoreFaultsPal = 0;
        scoreYCPal = 0;    scoreRCPal = 0;
        displayRCCorinthians(scoreRCCor); displayYCCorinthians(scoreYCCor);
        displayFaultsCorinthians(scoreFaultsCor); displayKickGCorinthians(scoreKickGCor);
        displayKickCorinthians(scoreKickCor); displayGoalCorinthians(scoreGoalCor);
        displayGoalPal(scoreGoalPal);  displayKickPal(scoreKickPal); displayKickGPal(scoreKickGPal);
        displayFaultsPal(scoreFaultsPal); displayYCPal(scoreYCPal); displayRCPal(scoreRCPal);
    }
    public void displayGoalPal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.palmeiras_goals_score);
        scoreView.setText(String.valueOf(score));
    }
    public void Goal_Palmeiras (View view){
        scoreGoalPal = scoreGoalPal + 1;
        displayGoalPal(scoreGoalPal);
    }
    public void displayKickPal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Score_kicks_pal);
        scoreView.setText(String.valueOf(score));
    }
    public void kicks_pal(View view){
        scoreKickPal = scoreKickPal + 1;
        displayKickPal(scoreKickPal);
    }
    public void displayKickGPal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Score_g_kicks_pal);
        scoreView.setText(String.valueOf(score));
    }
    public void Goal_Kicks_pal(View view){
        scoreKickGPal = scoreKickGPal + 1;
        displayKickGPal(scoreKickGPal);
    }
    public void displayFaultsPal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Score_faults_pal);
        scoreView.setText(String.valueOf(score));
    }
    public void faults_pal(View view){
        scoreFaultsPal = scoreFaultsPal + 1;
        displayFaultsPal(scoreFaultsPal);
    }
    public void displayYCPal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Score_yc_pal);
        scoreView.setText(String.valueOf(score));
    }
    public void yellow_cards_pal(View view){
        scoreYCPal = scoreYCPal + 1;
        displayYCPal(scoreYCPal);
    }
    public void displayRCPal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Score_rc_pal);
        scoreView.setText(String.valueOf(score));
    }
    public void Red_cards_pal(View view){
        scoreRCPal = scoreRCPal + 1;
        displayRCPal(scoreRCPal);
    }


}