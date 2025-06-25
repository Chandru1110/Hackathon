import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './HomePage/HomePage.component';
import { LTTComponent } from './LTT/LTT.component';
import { AvailabilityComponent } from './Availability/Availability.component';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    LTTComponent,
    AvailabilityComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
