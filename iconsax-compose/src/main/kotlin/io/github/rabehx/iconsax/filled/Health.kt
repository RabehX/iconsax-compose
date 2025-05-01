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


val Iconsax.Filled.Health: ImageVector
    get() {
        if (_Health != null) {
            return _Health!!
        }
        _Health = ImageVector.Builder(
            name = "Filled.Health",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 7.81f)
                verticalLineTo(12.5f)
                horizontalLineTo(17.92f)
                curveTo(17.8f, 12.49f, 17.54f, 12.34f, 17.48f, 12.23f)
                lineTo(16.44f, 10.26f)
                curveTo(16.03f, 9.48f, 15.32f, 9.04f, 14.56f, 9.08f)
                curveTo(13.8f, 9.12f, 13.15f, 9.63f, 12.82f, 10.46f)
                lineTo(11.44f, 13.92f)
                lineTo(11.24f, 13.4f)
                curveTo(10.75f, 12.13f, 9.35f, 11.17f, 7.97f, 11.17f)
                lineTo(2f, 11.2f)
                verticalLineTo(7.81f)
                curveTo(2f, 4.17f, 4.17f, 2f, 7.81f, 2f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 2f, 22f, 4.17f, 22f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 16.189f)
                verticalLineTo(13.999f)
                horizontalLineTo(17.92f)
                curveTo(17.25f, 13.999f, 16.46f, 13.519f, 16.15f, 12.929f)
                lineTo(15.11f, 10.959f)
                curveTo(14.83f, 10.429f, 14.43f, 10.459f, 14.21f, 11.009f)
                lineTo(11.91f, 16.819f)
                curveTo(11.66f, 17.469f, 11.24f, 17.469f, 10.98f, 16.819f)
                lineTo(9.84f, 13.939f)
                curveTo(9.57f, 13.239f, 8.73f, 12.669f, 7.98f, 12.669f)
                lineTo(2f, 12.699f)
                verticalLineTo(16.189f)
                curveTo(2f, 19.769f, 4.1f, 21.929f, 7.63f, 21.989f)
                curveTo(7.74f, 21.999f, 7.86f, 21.999f, 7.97f, 21.999f)
                horizontalLineTo(15.97f)
                curveTo(16.12f, 21.999f, 16.27f, 21.999f, 16.41f, 21.989f)
                curveTo(19.92f, 21.909f, 22f, 19.759f, 22f, 16.189f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.001f, 12.699f)
                verticalLineTo(16.009f)
                curveTo(1.981f, 15.689f, 1.971f, 15.349f, 1.971f, 14.999f)
                verticalLineTo(12.699f)
                horizontalLineTo(2.001f)
                close()
            }
        }.build()

        return _Health!!
    }

@Suppress("ObjectPropertyName")
private var _Health: ImageVector? = null
