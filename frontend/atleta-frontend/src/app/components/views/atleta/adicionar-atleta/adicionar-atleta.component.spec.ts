import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdicionarAtletaComponent } from './adicionar-atleta.component';

describe('AdicionarAtletaComponent', () => {
  let component: AdicionarAtletaComponent;
  let fixture: ComponentFixture<AdicionarAtletaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AdicionarAtletaComponent]
    });
    fixture = TestBed.createComponent(AdicionarAtletaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
