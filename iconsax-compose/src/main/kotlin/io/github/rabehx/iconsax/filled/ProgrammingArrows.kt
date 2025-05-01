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


val Iconsax.Filled.ProgrammingArrows: ImageVector
    get() {
        if (_ProgrammingArrows != null) {
            return _ProgrammingArrows!!
        }
        _ProgrammingArrows = ImageVector.Builder(
            name = "Filled.ProgrammingArrows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.73f, 16.101f)
                curveTo(19.73f, 16.071f, 19.75f, 16.041f, 19.75f, 16.001f)
                verticalLineTo(6.501f)
                curveTo(19.75f, 4.981f, 18.52f, 3.751f, 17f, 3.751f)
                horizontalLineTo(13.07f)
                lineTo(14.48f, 2.581f)
                curveTo(14.8f, 2.311f, 14.84f, 1.841f, 14.58f, 1.521f)
                curveTo(14.31f, 1.201f, 13.84f, 1.161f, 13.52f, 1.421f)
                lineTo(10.52f, 3.921f)
                curveTo(10.35f, 4.061f, 10.25f, 4.271f, 10.25f, 4.501f)
                curveTo(10.25f, 4.731f, 10.35f, 4.931f, 10.52f, 5.081f)
                lineTo(13.52f, 7.581f)
                curveTo(13.66f, 7.701f, 13.83f, 7.751f, 14f, 7.751f)
                curveTo(14.21f, 7.751f, 14.43f, 7.661f, 14.58f, 7.481f)
                curveTo(14.85f, 7.161f, 14.8f, 6.691f, 14.48f, 6.421f)
                lineTo(13.07f, 5.251f)
                horizontalLineTo(17f)
                curveTo(17.69f, 5.251f, 18.25f, 5.811f, 18.25f, 6.501f)
                verticalLineTo(16.001f)
                curveTo(18.25f, 16.041f, 18.27f, 16.071f, 18.27f, 16.101f)
                curveTo(16.97f, 16.431f, 16f, 17.601f, 16f, 19.001f)
                curveTo(16f, 20.661f, 17.34f, 22.001f, 19f, 22.001f)
                curveTo(20.66f, 22.001f, 22f, 20.661f, 22f, 19.001f)
                curveTo(22f, 17.601f, 21.03f, 16.431f, 19.73f, 16.101f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.48f, 18.92f)
                lineTo(10.48f, 16.42f)
                curveTo(10.16f, 16.15f, 9.69f, 16.2f, 9.42f, 16.52f)
                curveTo(9.15f, 16.84f, 9.2f, 17.31f, 9.52f, 17.58f)
                lineTo(10.93f, 18.75f)
                horizontalLineTo(7f)
                curveTo(6.31f, 18.75f, 5.75f, 18.19f, 5.75f, 17.5f)
                verticalLineTo(8f)
                curveTo(5.75f, 7.96f, 5.73f, 7.93f, 5.73f, 7.9f)
                curveTo(7.03f, 7.57f, 8f, 6.4f, 8f, 5f)
                curveTo(8f, 3.34f, 6.66f, 2f, 5f, 2f)
                curveTo(3.34f, 2f, 2f, 3.34f, 2f, 5f)
                curveTo(2f, 6.4f, 2.97f, 7.57f, 4.27f, 7.9f)
                curveTo(4.27f, 7.93f, 4.25f, 7.96f, 4.25f, 8f)
                verticalLineTo(17.5f)
                curveTo(4.25f, 19.02f, 5.48f, 20.25f, 7f, 20.25f)
                horizontalLineTo(10.93f)
                lineTo(9.52f, 21.42f)
                curveTo(9.2f, 21.69f, 9.16f, 22.16f, 9.42f, 22.48f)
                curveTo(9.57f, 22.66f, 9.78f, 22.75f, 10f, 22.75f)
                curveTo(10.17f, 22.75f, 10.34f, 22.69f, 10.48f, 22.58f)
                lineTo(13.48f, 20.08f)
                curveTo(13.65f, 19.94f, 13.75f, 19.73f, 13.75f, 19.5f)
                curveTo(13.75f, 19.27f, 13.65f, 19.07f, 13.48f, 18.92f)
                close()
            }
        }.build()

        return _ProgrammingArrows!!
    }

@Suppress("ObjectPropertyName")
private var _ProgrammingArrows: ImageVector? = null
