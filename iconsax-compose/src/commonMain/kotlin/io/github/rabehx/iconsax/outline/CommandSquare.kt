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

val Iconsax.Outline.CommandSquare: ImageVector
    get() {
        if (_CommandSquare != null) {
            return _CommandSquare!!
        }
        _CommandSquare = ImageVector.Builder(
            name = "Outline.CommandSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.4f, 15.15f)
                horizontalLineTo(9.6f)
                curveTo(9.19f, 15.15f, 8.85f, 14.81f, 8.85f, 14.4f)
                verticalLineTo(9.6f)
                curveTo(8.85f, 9.19f, 9.19f, 8.85f, 9.6f, 8.85f)
                horizontalLineTo(14.4f)
                curveTo(14.81f, 8.85f, 15.15f, 9.19f, 15.15f, 9.6f)
                verticalLineTo(14.4f)
                curveTo(15.15f, 14.81f, 14.81f, 15.15f, 14.4f, 15.15f)
                close()
                moveTo(10.35f, 13.65f)
                horizontalLineTo(13.65f)
                verticalLineTo(10.35f)
                horizontalLineTo(10.35f)
                verticalLineTo(13.65f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.8f, 18.75f)
                curveTo(6.39f, 18.75f, 5.25f, 17.61f, 5.25f, 16.2f)
                curveTo(5.25f, 14.79f, 6.39f, 13.65f, 7.8f, 13.65f)
                horizontalLineTo(9.6f)
                curveTo(10.01f, 13.65f, 10.35f, 13.99f, 10.35f, 14.4f)
                verticalLineTo(16.2f)
                curveTo(10.35f, 17.61f, 9.21f, 18.75f, 7.8f, 18.75f)
                close()
                moveTo(7.8f, 15.15f)
                curveTo(7.22f, 15.15f, 6.75f, 15.62f, 6.75f, 16.2f)
                curveTo(6.75f, 16.78f, 7.22f, 17.25f, 7.8f, 17.25f)
                curveTo(8.38f, 17.25f, 8.85f, 16.78f, 8.85f, 16.2f)
                verticalLineTo(15.15f)
                horizontalLineTo(7.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.6f, 10.35f)
                horizontalLineTo(7.8f)
                curveTo(6.39f, 10.35f, 5.25f, 9.21f, 5.25f, 7.8f)
                curveTo(5.25f, 6.39f, 6.39f, 5.25f, 7.8f, 5.25f)
                curveTo(9.21f, 5.25f, 10.35f, 6.39f, 10.35f, 7.8f)
                verticalLineTo(9.6f)
                curveTo(10.35f, 10.01f, 10.01f, 10.35f, 9.6f, 10.35f)
                close()
                moveTo(7.8f, 6.75f)
                curveTo(7.22f, 6.75f, 6.75f, 7.22f, 6.75f, 7.8f)
                curveTo(6.75f, 8.38f, 7.22f, 8.85f, 7.8f, 8.85f)
                horizontalLineTo(8.85f)
                verticalLineTo(7.8f)
                curveTo(8.85f, 7.22f, 8.38f, 6.75f, 7.8f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.2f, 10.35f)
                horizontalLineTo(14.4f)
                curveTo(13.99f, 10.35f, 13.65f, 10.01f, 13.65f, 9.6f)
                verticalLineTo(7.8f)
                curveTo(13.65f, 6.39f, 14.79f, 5.25f, 16.2f, 5.25f)
                curveTo(17.61f, 5.25f, 18.75f, 6.39f, 18.75f, 7.8f)
                curveTo(18.75f, 9.21f, 17.61f, 10.35f, 16.2f, 10.35f)
                close()
                moveTo(15.15f, 8.85f)
                horizontalLineTo(16.2f)
                curveTo(16.78f, 8.85f, 17.25f, 8.38f, 17.25f, 7.8f)
                curveTo(17.25f, 7.22f, 16.78f, 6.75f, 16.2f, 6.75f)
                curveTo(15.62f, 6.75f, 15.15f, 7.22f, 15.15f, 7.8f)
                verticalLineTo(8.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.2f, 18.75f)
                curveTo(14.79f, 18.75f, 13.65f, 17.61f, 13.65f, 16.2f)
                verticalLineTo(14.4f)
                curveTo(13.65f, 13.99f, 13.99f, 13.65f, 14.4f, 13.65f)
                horizontalLineTo(16.2f)
                curveTo(17.61f, 13.65f, 18.75f, 14.79f, 18.75f, 16.2f)
                curveTo(18.75f, 17.61f, 17.61f, 18.75f, 16.2f, 18.75f)
                close()
                moveTo(15.15f, 15.15f)
                verticalLineTo(16.2f)
                curveTo(15.15f, 16.78f, 15.62f, 17.25f, 16.2f, 17.25f)
                curveTo(16.78f, 17.25f, 17.25f, 16.78f, 17.25f, 16.2f)
                curveTo(17.25f, 15.62f, 16.78f, 15.15f, 16.2f, 15.15f)
                horizontalLineTo(15.15f)
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

        return _CommandSquare!!
    }

@Suppress("ObjectPropertyName")
private var _CommandSquare: ImageVector? = null
