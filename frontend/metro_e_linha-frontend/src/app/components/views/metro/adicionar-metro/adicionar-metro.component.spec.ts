import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdicionarMetroComponent } from './adicionar-metro.component';

describe('AdicionarMetroComponent', () => {
  let component: AdicionarMetroComponent;
  let fixture: ComponentFixture<AdicionarMetroComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AdicionarMetroComponent]
    });
    fixture = TestBed.createComponent(AdicionarMetroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
