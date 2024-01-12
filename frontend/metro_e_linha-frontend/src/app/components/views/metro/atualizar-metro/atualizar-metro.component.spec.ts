import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AtualizarMetroComponent } from './atualizar-metro.component';

describe('AtualizarMetroComponent', () => {
  let component: AtualizarMetroComponent;
  let fixture: ComponentFixture<AtualizarMetroComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AtualizarMetroComponent]
    });
    fixture = TestBed.createComponent(AtualizarMetroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
