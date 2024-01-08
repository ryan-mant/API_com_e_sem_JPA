import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AtualizarPacoteComponent } from './atualizar-pacote.component';

describe('AtualizarPacoteComponent', () => {
  let component: AtualizarPacoteComponent;
  let fixture: ComponentFixture<AtualizarPacoteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AtualizarPacoteComponent]
    });
    fixture = TestBed.createComponent(AtualizarPacoteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
