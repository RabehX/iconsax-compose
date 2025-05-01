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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.ProgrammingArrow: ImageVector
    get() {
        if (_ProgrammingArrow != null) {
            return _ProgrammingArrow!!
        }
        _ProgrammingArrow = ImageVector.Builder(
            name = "Filled.ProgrammingArrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.75f, 16.11f)
                verticalLineTo(7.89f)
                curveTo(7.04f, 7.56f, 8f, 6.4f, 8f, 5f)
                curveTo(8f, 3.34f, 6.66f, 2f, 5f, 2f)
                curveTo(3.34f, 2f, 2f, 3.34f, 2f, 5f)
                curveTo(2f, 6.4f, 2.96f, 7.56f, 4.25f, 7.89f)
                verticalLineTo(16.1f)
                curveTo(2.96f, 16.44f, 2f, 17.6f, 2f, 19f)
                curveTo(2f, 20.66f, 3.34f, 22f, 5f, 22f)
                curveTo(6.66f, 22f, 8f, 20.66f, 8f, 19f)
                curveTo(8f, 17.6f, 7.04f, 16.44f, 5.75f, 16.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.75f, 16.111f)
                verticalLineTo(6.501f)
                curveTo(19.75f, 4.981f, 18.52f, 3.751f, 17f, 3.751f)
                horizontalLineTo(14.07f)
                lineTo(15.48f, 2.581f)
                curveTo(15.8f, 2.311f, 15.84f, 1.841f, 15.58f, 1.521f)
                curveTo(15.31f, 1.201f, 14.84f, 1.161f, 14.52f, 1.421f)
                lineTo(11.52f, 3.921f)
                curveTo(11.35f, 4.061f, 11.25f, 4.271f, 11.25f, 4.501f)
                curveTo(11.25f, 4.731f, 11.35f, 4.931f, 11.52f, 5.081f)
                lineTo(14.52f, 7.581f)
                curveTo(14.66f, 7.701f, 14.83f, 7.751f, 15f, 7.751f)
                curveTo(15.21f, 7.751f, 15.43f, 7.661f, 15.58f, 7.481f)
                curveTo(15.85f, 7.161f, 15.8f, 6.691f, 15.48f, 6.421f)
                lineTo(14.07f, 5.251f)
                horizontalLineTo(17f)
                curveTo(17.69f, 5.251f, 18.25f, 5.811f, 18.25f, 6.501f)
                verticalLineTo(16.111f)
                curveTo(16.96f, 16.441f, 16f, 17.601f, 16f, 19.001f)
                curveTo(16f, 20.661f, 17.34f, 22.001f, 19f, 22.001f)
                curveTo(20.66f, 22.001f, 22f, 20.661f, 22f, 19.001f)
                curveTo(22f, 17.601f, 21.04f, 16.441f, 19.75f, 16.111f)
                close()
            }
        }.build()

        return _ProgrammingArrow!!
    }

@Suppress("ObjectPropertyName")
private var _ProgrammingArrow: ImageVector? = null
