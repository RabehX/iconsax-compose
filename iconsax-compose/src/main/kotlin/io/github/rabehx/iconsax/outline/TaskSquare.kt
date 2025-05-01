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

val Iconsax.Outline.TaskSquare: ImageVector
    get() {
        if (_TaskSquare != null) {
            return _TaskSquare!!
        }
        _TaskSquare = ImageVector.Builder(
            name = "Outline.TaskSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.619f, 9.62f)
                horizontalLineTo(12.369f)
                curveTo(11.959f, 9.62f, 11.619f, 9.28f, 11.619f, 8.87f)
                curveTo(11.619f, 8.46f, 11.959f, 8.12f, 12.369f, 8.12f)
                horizontalLineTo(17.619f)
                curveTo(18.029f, 8.12f, 18.369f, 8.46f, 18.369f, 8.87f)
                curveTo(18.369f, 9.28f, 18.039f, 9.62f, 17.619f, 9.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.121f, 10.38f)
                curveTo(6.931f, 10.38f, 6.741f, 10.31f, 6.591f, 10.16f)
                lineTo(5.841f, 9.41f)
                curveTo(5.551f, 9.12f, 5.551f, 8.64f, 5.841f, 8.35f)
                curveTo(6.131f, 8.06f, 6.611f, 8.06f, 6.901f, 8.35f)
                lineTo(7.121f, 8.57f)
                lineTo(8.841f, 6.85f)
                curveTo(9.131f, 6.56f, 9.611f, 6.56f, 9.901f, 6.85f)
                curveTo(10.191f, 7.14f, 10.191f, 7.62f, 9.901f, 7.91f)
                lineTo(7.651f, 10.16f)
                curveTo(7.511f, 10.3f, 7.321f, 10.38f, 7.121f, 10.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.619f, 16.62f)
                horizontalLineTo(12.369f)
                curveTo(11.959f, 16.62f, 11.619f, 16.28f, 11.619f, 15.87f)
                curveTo(11.619f, 15.46f, 11.959f, 15.12f, 12.369f, 15.12f)
                horizontalLineTo(17.619f)
                curveTo(18.029f, 15.12f, 18.369f, 15.46f, 18.369f, 15.87f)
                curveTo(18.369f, 16.28f, 18.039f, 16.62f, 17.619f, 16.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.121f, 17.38f)
                curveTo(6.931f, 17.38f, 6.741f, 17.31f, 6.591f, 17.16f)
                lineTo(5.841f, 16.41f)
                curveTo(5.551f, 16.12f, 5.551f, 15.64f, 5.841f, 15.35f)
                curveTo(6.131f, 15.06f, 6.611f, 15.06f, 6.901f, 15.35f)
                lineTo(7.121f, 15.57f)
                lineTo(8.841f, 13.85f)
                curveTo(9.131f, 13.56f, 9.611f, 13.56f, 9.901f, 13.85f)
                curveTo(10.191f, 14.14f, 10.191f, 14.62f, 9.901f, 14.91f)
                lineTo(7.651f, 17.16f)
                curveTo(7.511f, 17.3f, 7.321f, 17.38f, 7.121f, 17.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _TaskSquare!!
    }

@Suppress("ObjectPropertyName")
private var _TaskSquare: ImageVector? = null
