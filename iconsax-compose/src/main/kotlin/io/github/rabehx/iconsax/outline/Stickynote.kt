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

val Iconsax.Outline.Stickynote: ImageVector
    get() {
        if (_Stickynote != null) {
            return _Stickynote!!
        }
        _Stickynote = ImageVector.Builder(
            name = "Outline.Stickynote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 5.75f)
                curveTo(7.59f, 5.75f, 7.25f, 5.41f, 7.25f, 5f)
                verticalLineTo(2f)
                curveTo(7.25f, 1.59f, 7.59f, 1.25f, 8f, 1.25f)
                curveTo(8.41f, 1.25f, 8.75f, 1.59f, 8.75f, 2f)
                verticalLineTo(5f)
                curveTo(8.75f, 5.41f, 8.41f, 5.75f, 8f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 5.75f)
                curveTo(15.59f, 5.75f, 15.25f, 5.41f, 15.25f, 5f)
                verticalLineTo(2f)
                curveTo(15.25f, 1.59f, 15.59f, 1.25f, 16f, 1.25f)
                curveTo(16.41f, 1.25f, 16.75f, 1.59f, 16.75f, 2f)
                verticalLineTo(5f)
                curveTo(16.75f, 5.41f, 16.41f, 5.75f, 16f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 11.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 11.75f, 6.25f, 11.41f, 6.25f, 11f)
                curveTo(6.25f, 10.59f, 6.59f, 10.25f, 7f, 10.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 10.25f, 15.75f, 10.59f, 15.75f, 11f)
                curveTo(15.75f, 11.41f, 15.41f, 11.75f, 15f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 15.75f, 6.25f, 15.41f, 6.25f, 15f)
                curveTo(6.25f, 14.59f, 6.59f, 14.25f, 7f, 14.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 14.25f, 12.75f, 14.59f, 12.75f, 15f)
                curveTo(12.75f, 15.41f, 12.41f, 15.75f, 12f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.38f, 22.75f, 2.25f, 20.1f, 2.25f, 15.82f)
                verticalLineTo(9.65f)
                curveTo(2.25f, 4.91f, 3.85f, 2.98f, 7.96f, 2.75f)
                horizontalLineTo(16f)
                curveTo(20.15f, 2.98f, 21.75f, 4.91f, 21.75f, 9.65f)
                verticalLineTo(16f)
                curveTo(21.75f, 16.41f, 21.41f, 16.75f, 21f, 16.75f)
                curveTo(20.59f, 16.75f, 20.25f, 16.41f, 20.25f, 16f)
                verticalLineTo(9.65f)
                curveTo(20.25f, 5.29f, 18.8f, 4.41f, 15.96f, 4.25f)
                horizontalLineTo(8f)
                curveTo(5.2f, 4.41f, 3.75f, 5.29f, 3.75f, 9.65f)
                verticalLineTo(15.82f)
                curveTo(3.75f, 19.65f, 4.48f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 21.25f, 15.75f, 21.59f, 15.75f, 22f)
                curveTo(15.75f, 22.41f, 15.41f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                curveTo(14.9f, 22.75f, 14.81f, 22.73f, 14.71f, 22.69f)
                curveTo(14.43f, 22.57f, 14.25f, 22.3f, 14.25f, 22f)
                verticalLineTo(19f)
                curveTo(14.25f, 16.58f, 15.58f, 15.25f, 18f, 15.25f)
                horizontalLineTo(21f)
                curveTo(21.3f, 15.25f, 21.58f, 15.43f, 21.69f, 15.71f)
                curveTo(21.81f, 15.99f, 21.74f, 16.31f, 21.53f, 16.53f)
                lineTo(15.53f, 22.53f)
                curveTo(15.39f, 22.67f, 15.2f, 22.75f, 15f, 22.75f)
                close()
                moveTo(18f, 16.75f)
                curveTo(16.42f, 16.75f, 15.75f, 17.42f, 15.75f, 19f)
                verticalLineTo(20.19f)
                lineTo(19.19f, 16.75f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _Stickynote!!
    }

@Suppress("ObjectPropertyName")
private var _Stickynote: ImageVector? = null
