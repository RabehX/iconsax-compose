/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.ProgrammingArrow: ImageVector
    get() {
        if (_ProgrammingArrow != null) {
            return _ProgrammingArrow!!
        }
        _ProgrammingArrow = ImageVector.Builder(
            name = "Outline.ProgrammingArrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 16.75f)
                curveTo(18.59f, 16.75f, 18.25f, 16.41f, 18.25f, 16f)
                verticalLineTo(6.5f)
                curveTo(18.25f, 5.81f, 17.69f, 5.25f, 17f, 5.25f)
                horizontalLineTo(12.5f)
                curveTo(12.09f, 5.25f, 11.75f, 4.91f, 11.75f, 4.5f)
                curveTo(11.75f, 4.09f, 12.09f, 3.75f, 12.5f, 3.75f)
                horizontalLineTo(17f)
                curveTo(18.52f, 3.75f, 19.75f, 4.98f, 19.75f, 6.5f)
                verticalLineTo(16f)
                curveTo(19.75f, 16.41f, 19.41f, 16.75f, 19f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 7.75f)
                curveTo(14.83f, 7.75f, 14.66f, 7.69f, 14.52f, 7.58f)
                lineTo(11.52f, 5.08f)
                curveTo(11.35f, 4.94f, 11.25f, 4.73f, 11.25f, 4.5f)
                curveTo(11.25f, 4.27f, 11.35f, 4.07f, 11.52f, 3.92f)
                lineTo(14.52f, 1.42f)
                curveTo(14.84f, 1.15f, 15.31f, 1.2f, 15.58f, 1.52f)
                curveTo(15.85f, 1.84f, 15.8f, 2.31f, 15.48f, 2.58f)
                lineTo(13.17f, 4.5f)
                lineTo(15.48f, 6.42f)
                curveTo(15.8f, 6.69f, 15.84f, 7.16f, 15.58f, 7.48f)
                curveTo(15.43f, 7.66f, 15.21f, 7.75f, 15f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 16.75f)
                curveTo(4.59f, 16.75f, 4.25f, 16.41f, 4.25f, 16f)
                verticalLineTo(9f)
                curveTo(4.25f, 8.59f, 4.59f, 8.25f, 5f, 8.25f)
                curveTo(5.41f, 8.25f, 5.75f, 8.59f, 5.75f, 9f)
                verticalLineTo(16f)
                curveTo(5.75f, 16.41f, 5.41f, 16.75f, 5f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.25f, 9.25f)
                curveTo(3.04f, 9.25f, 1.25f, 7.46f, 1.25f, 5.25f)
                curveTo(1.25f, 3.04f, 3.04f, 1.25f, 5.25f, 1.25f)
                curveTo(7.46f, 1.25f, 9.25f, 3.04f, 9.25f, 5.25f)
                curveTo(9.25f, 7.46f, 7.46f, 9.25f, 5.25f, 9.25f)
                close()
                moveTo(5.25f, 2.75f)
                curveTo(3.87f, 2.75f, 2.75f, 3.87f, 2.75f, 5.25f)
                curveTo(2.75f, 6.63f, 3.87f, 7.75f, 5.25f, 7.75f)
                curveTo(6.63f, 7.75f, 7.75f, 6.63f, 7.75f, 5.25f)
                curveTo(7.75f, 3.87f, 6.63f, 2.75f, 5.25f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 22.75f)
                curveTo(2.93f, 22.75f, 1.25f, 21.07f, 1.25f, 19f)
                curveTo(1.25f, 16.93f, 2.93f, 15.25f, 5f, 15.25f)
                curveTo(7.07f, 15.25f, 8.75f, 16.93f, 8.75f, 19f)
                curveTo(8.75f, 21.07f, 7.07f, 22.75f, 5f, 22.75f)
                close()
                moveTo(5f, 16.75f)
                curveTo(3.76f, 16.75f, 2.75f, 17.76f, 2.75f, 19f)
                curveTo(2.75f, 20.24f, 3.76f, 21.25f, 5f, 21.25f)
                curveTo(6.24f, 21.25f, 7.25f, 20.24f, 7.25f, 19f)
                curveTo(7.25f, 17.76f, 6.24f, 16.75f, 5f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22.75f)
                curveTo(16.93f, 22.75f, 15.25f, 21.07f, 15.25f, 19f)
                curveTo(15.25f, 16.93f, 16.93f, 15.25f, 19f, 15.25f)
                curveTo(21.07f, 15.25f, 22.75f, 16.93f, 22.75f, 19f)
                curveTo(22.75f, 21.07f, 21.07f, 22.75f, 19f, 22.75f)
                close()
                moveTo(19f, 16.75f)
                curveTo(17.76f, 16.75f, 16.75f, 17.76f, 16.75f, 19f)
                curveTo(16.75f, 20.24f, 17.76f, 21.25f, 19f, 21.25f)
                curveTo(20.24f, 21.25f, 21.25f, 20.24f, 21.25f, 19f)
                curveTo(21.25f, 17.76f, 20.24f, 16.75f, 19f, 16.75f)
                close()
            }
        }.build()

        return _ProgrammingArrow!!
    }

@Suppress("ObjectPropertyName")
private var _ProgrammingArrow: ImageVector? = null
