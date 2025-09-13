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

val Iconsax.Outline.Computing: ImageVector
    get() {
        if (_Computing != null) {
            return _Computing!!
        }
        _Computing = ImageVector.Builder(
            name = "Outline.Computing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.971f, 22.75f)
                horizontalLineTo(8.971f)
                curveTo(3.541f, 22.75f, 1.221f, 20.43f, 1.221f, 15f)
                verticalLineTo(9f)
                curveTo(1.221f, 3.57f, 3.541f, 1.25f, 8.971f, 1.25f)
                horizontalLineTo(14.971f)
                curveTo(20.401f, 1.25f, 22.721f, 3.57f, 22.721f, 9f)
                verticalLineTo(15f)
                curveTo(22.721f, 20.43f, 20.411f, 22.75f, 14.971f, 22.75f)
                close()
                moveTo(8.971f, 2.75f)
                curveTo(4.361f, 2.75f, 2.721f, 4.39f, 2.721f, 9f)
                verticalLineTo(15f)
                curveTo(2.721f, 19.61f, 4.361f, 21.25f, 8.971f, 21.25f)
                horizontalLineTo(14.971f)
                curveTo(19.581f, 21.25f, 21.221f, 19.61f, 21.221f, 15f)
                verticalLineTo(9f)
                curveTo(21.221f, 4.39f, 19.581f, 2.75f, 14.971f, 2.75f)
                horizontalLineTo(8.971f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.271f, 20.45f)
                curveTo(3.081f, 20.45f, 2.891f, 20.38f, 2.741f, 20.23f)
                curveTo(2.451f, 19.94f, 2.451f, 19.46f, 2.741f, 19.17f)
                lineTo(19.191f, 2.72f)
                curveTo(19.481f, 2.43f, 19.961f, 2.43f, 20.251f, 2.72f)
                curveTo(20.541f, 3.01f, 20.541f, 3.49f, 20.251f, 3.78f)
                lineTo(3.801f, 20.23f)
                curveTo(3.661f, 20.38f, 3.471f, 20.45f, 3.271f, 20.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.06f, 18.75f)
                curveTo(15.651f, 18.75f, 15.311f, 18.41f, 15.311f, 18f)
                verticalLineTo(13f)
                curveTo(15.311f, 12.59f, 15.651f, 12.25f, 16.06f, 12.25f)
                curveTo(16.471f, 12.25f, 16.81f, 12.59f, 16.81f, 13f)
                verticalLineTo(18f)
                curveTo(16.81f, 18.41f, 16.471f, 18.75f, 16.06f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 16.25f)
                horizontalLineTo(13.5f)
                curveTo(13.09f, 16.25f, 12.75f, 15.91f, 12.75f, 15.5f)
                curveTo(12.75f, 15.09f, 13.09f, 14.75f, 13.5f, 14.75f)
                horizontalLineTo(18.5f)
                curveTo(18.91f, 14.75f, 19.25f, 15.09f, 19.25f, 15.5f)
                curveTo(19.25f, 15.91f, 18.91f, 16.25f, 18.5f, 16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.5f, 8.25f)
                horizontalLineTo(5.5f)
                curveTo(5.09f, 8.25f, 4.75f, 7.91f, 4.75f, 7.5f)
                curveTo(4.75f, 7.09f, 5.09f, 6.75f, 5.5f, 6.75f)
                horizontalLineTo(10.5f)
                curveTo(10.91f, 6.75f, 11.25f, 7.09f, 11.25f, 7.5f)
                curveTo(11.25f, 7.91f, 10.91f, 8.25f, 10.5f, 8.25f)
                close()
            }
        }.build()

        return _Computing!!
    }

@Suppress("ObjectPropertyName")
private var _Computing: ImageVector? = null
