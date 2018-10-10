package com.tictactoemulti.hg.tictactoe;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int winner =-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    //to determine current player
    int ActivePlayer = 1;
    //store player moves
    ArrayList<Integer> playerOneMoves = new ArrayList<>();

    ArrayList<Integer> playerTwoMoves = new ArrayList<>();


    public void btnClick(View view) {
        Button btnSelected = (Button) view;
        int mId = 0;
        //to get button ids
        switch (btnSelected.getId()) {
            case R.id.btn_1:
                mId = 1;
                break;
            case R.id.btn_2:
                mId = 2;
                break;
            case R.id.btn_3:
                mId = 3;
                break;
            case R.id.btn_4:
                mId = 4;
                break;
            case R.id.btn_5:
                mId = 5;
                break;
            case R.id.btn_6:
                mId = 6;
                break;
            case R.id.btn_7:
                mId = 7;
                break;
            case R.id.btn_8:
                mId = 8;
                break;
            case R.id.btn_9:
                mId = 9;
                break;
        }

        game(mId, btnSelected);

    }

    void game(int id, Button buttonSelected) {
        if (ActivePlayer == 1) {
            buttonSelected.setTextSize(40);
            buttonSelected.setText("X");
            playerOneMoves.add(id);
            ActivePlayer = 2;
        } else if (ActivePlayer == 2) {
            buttonSelected.setTextSize(40);
            buttonSelected.setText("O");
            playerTwoMoves.add(id);
            ActivePlayer = 1;

        }
        buttonSelected.setEnabled(false);
        int result=winner();
        if (result==1) {
            Toast.makeText(this, "Player One Winner", Toast.LENGTH_LONG).show();
            winner=-1;
            playerOneMoves.removeAll(playerOneMoves);
            //onRestart();
            MainActivity.this.recreate();

        }
        else if (result==2){
            Toast.makeText(this,"Player Two Winner",Toast.LENGTH_LONG).show();
            winner=-1;
            playerTwoMoves.removeAll(playerTwoMoves);
            onRestart();
            MainActivity.this.recreate();

        }
        //To check Draw Condition
        else if(playerOneMoves.size()==5&&playerTwoMoves.size()==4 || playerOneMoves.size()==4&&playerTwoMoves.size()==5){
            Toast.makeText(this,"Draw",Toast.LENGTH_LONG).show();
            MainActivity.this.recreate();


        }



    }
        //function to check the winner
        public int winner() {


        //conditions to check the winner
        if (playerOneMoves.contains(1) && playerOneMoves.contains(2) && playerOneMoves.contains(3)) {
            winner = 1;
        }
        else if (playerTwoMoves.contains(1) && playerTwoMoves.contains(2) && playerTwoMoves.contains(3)) {
            winner = 2;
        }

        else if (playerOneMoves.contains(4) && playerOneMoves.contains(5) && playerOneMoves.contains(6)) {
            winner = 1;
        }
        else if (playerTwoMoves.contains(4) && playerTwoMoves.contains(5) && playerTwoMoves.contains(6)) {
            winner = 2;
        }

        else if (playerOneMoves.contains(7) && playerOneMoves.contains(8) && playerOneMoves.contains(9)) {
            winner = 1;
        }
        else if (playerTwoMoves.contains(7) && playerTwoMoves.contains(8) && playerTwoMoves.contains(9)) {
            winner = 2;
        }

        else if (playerOneMoves.contains(1) && playerOneMoves.contains(4) && playerOneMoves.contains(7)) {
            winner = 1;
        }
        else if (playerTwoMoves.contains(1) && playerTwoMoves.contains(4) && playerTwoMoves.contains(7)) {
            winner = 2;
        }

        else if (playerOneMoves.contains(2) && playerOneMoves.contains(5) && playerOneMoves.contains(8)) {
            winner = 1;
        }
        else if (playerTwoMoves.contains(2) && playerTwoMoves.contains(5) && playerTwoMoves.contains(8)) {
            winner = 2;
        }

        else if (playerOneMoves.contains(3) && playerOneMoves.contains(6) && playerOneMoves.contains(9)) {
            winner = 1;
        }
        else if (playerTwoMoves.contains(3) && playerTwoMoves.contains(6) && playerTwoMoves.contains(9)) {
            winner = 2;
        }
        else if (playerOneMoves.contains(2) && playerOneMoves.contains(5) && playerOneMoves.contains(8)) {
            winner = 1;
        }
        else if (playerTwoMoves.contains(2) && playerTwoMoves.contains(5) && playerTwoMoves.contains(8)) {
            winner = 2;
        }
        else if (playerOneMoves.contains(3) && playerOneMoves.contains(6) && playerOneMoves.contains(9)) {
            winner = 1;
        }
        else if (playerTwoMoves.contains(3) && playerTwoMoves.contains(6) && playerTwoMoves.contains(9)) {
            winner = 2;
        }
        else if (playerOneMoves.contains(1) && playerOneMoves.contains(5) && playerOneMoves.contains(9)) {
            winner = 1;
        }
        else if (playerTwoMoves.contains(3) && playerTwoMoves.contains(5) && playerTwoMoves.contains(7)) {
            winner = 2;
        }

        return winner;
        }


    }

