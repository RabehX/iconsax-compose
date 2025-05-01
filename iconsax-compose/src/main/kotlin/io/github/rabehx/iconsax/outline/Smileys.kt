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

val Iconsax.Outline.Smileys: ImageVector
    get() {
        if (_Smileys != null) {
            return _Smileys!!
        }
        _Smileys = ImageVector.Builder(
            name = "Outline.Smileys",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 14.75f)
                horizontalLineTo(6.2f)
                curveTo(2.78f, 14.75f, 1.25f, 13.22f, 1.25f, 9.8f)
                verticalLineTo(6.2f)
                curveTo(1.25f, 2.78f, 2.78f, 1.25f, 6.2f, 1.25f)
                horizontalLineTo(9.8f)
                curveTo(13.22f, 1.25f, 14.75f, 2.78f, 14.75f, 6.2f)
                verticalLineTo(10f)
                curveTo(14.75f, 10.41f, 14.42f, 10.74f, 14.01f, 10.75f)
                curveTo(11.61f, 10.79f, 10.79f, 11.62f, 10.75f, 14.01f)
                curveTo(10.74f, 14.42f, 10.41f, 14.75f, 10f, 14.75f)
                close()
                moveTo(6.2f, 2.75f)
                curveTo(3.62f, 2.75f, 2.75f, 3.62f, 2.75f, 6.2f)
                verticalLineTo(9.8f)
                curveTo(2.75f, 12.38f, 3.62f, 13.25f, 6.2f, 13.25f)
                horizontalLineTo(9.29f)
                curveTo(9.53f, 10.81f, 10.81f, 9.54f, 13.25f, 9.29f)
                verticalLineTo(6.2f)
                curveTo(13.25f, 3.62f, 12.38f, 2.75f, 9.8f, 2.75f)
                horizontalLineTo(6.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.2f, 6.63f)
                curveTo(4.97f, 6.63f, 4.73f, 6.52f, 4.59f, 6.31f)
                curveTo(4.35f, 5.97f, 4.43f, 5.5f, 4.77f, 5.26f)
                curveTo(5.55f, 4.71f, 6.6f, 4.7f, 7.39f, 5.24f)
                curveTo(7.73f, 5.47f, 7.82f, 5.94f, 7.59f, 6.28f)
                curveTo(7.36f, 6.62f, 6.89f, 6.71f, 6.55f, 6.48f)
                curveTo(6.28f, 6.3f, 5.92f, 6.3f, 5.65f, 6.49f)
                curveTo(5.5f, 6.59f, 5.35f, 6.63f, 5.2f, 6.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.2f, 6.63f)
                curveTo(8.97f, 6.63f, 8.73f, 6.52f, 8.59f, 6.31f)
                curveTo(8.35f, 5.97f, 8.43f, 5.5f, 8.77f, 5.26f)
                curveTo(9.55f, 4.71f, 10.599f, 4.7f, 11.389f, 5.24f)
                curveTo(11.729f, 5.47f, 11.819f, 5.94f, 11.59f, 6.28f)
                curveTo(11.359f, 6.62f, 10.889f, 6.71f, 10.55f, 6.48f)
                curveTo(10.28f, 6.3f, 9.92f, 6.3f, 9.65f, 6.49f)
                curveTo(9.5f, 6.59f, 9.35f, 6.63f, 9.2f, 6.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.161f, 12.17f)
                horizontalLineTo(5.841f)
                curveTo(5.131f, 12.17f, 4.551f, 11.59f, 4.551f, 10.88f)
                curveTo(4.551f, 8.98f, 6.101f, 7.43f, 8.001f, 7.43f)
                curveTo(8.781f, 7.43f, 9.551f, 7.7f, 10.161f, 8.19f)
                curveTo(10.481f, 8.45f, 10.541f, 8.92f, 10.281f, 9.24f)
                curveTo(10.021f, 9.56f, 9.551f, 9.61f, 9.231f, 9.36f)
                curveTo(8.881f, 9.08f, 8.461f, 8.93f, 8.011f, 8.93f)
                curveTo(7.011f, 8.93f, 6.181f, 9.69f, 6.071f, 10.67f)
                horizontalLineTo(8.171f)
                curveTo(8.581f, 10.67f, 8.921f, 11.01f, 8.921f, 11.42f)
                curveTo(8.921f, 11.83f, 8.571f, 12.17f, 8.161f, 12.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.8f, 22.75f)
                horizontalLineTo(14.2f)
                curveTo(10.78f, 22.75f, 9.25f, 21.22f, 9.25f, 17.8f)
                verticalLineTo(14f)
                curveTo(9.31f, 10.81f, 10.81f, 9.31f, 13.99f, 9.25f)
                horizontalLineTo(17.8f)
                curveTo(21.22f, 9.25f, 22.75f, 10.78f, 22.75f, 14.2f)
                verticalLineTo(17.8f)
                curveTo(22.75f, 21.22f, 21.22f, 22.75f, 17.8f, 22.75f)
                close()
                moveTo(14f, 10.75f)
                curveTo(11.62f, 10.79f, 10.79f, 11.62f, 10.75f, 14.01f)
                verticalLineTo(17.8f)
                curveTo(10.75f, 20.38f, 11.62f, 21.25f, 14.2f, 21.25f)
                horizontalLineTo(17.8f)
                curveTo(20.38f, 21.25f, 21.25f, 20.38f, 21.25f, 17.8f)
                verticalLineTo(14.2f)
                curveTo(21.25f, 11.62f, 20.38f, 10.75f, 17.8f, 10.75f)
                horizontalLineTo(14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.09f, 14.63f)
                curveTo(13.62f, 14.63f, 13.16f, 14.49f, 12.769f, 14.21f)
                curveTo(12.429f, 13.97f, 12.349f, 13.5f, 12.59f, 13.16f)
                curveTo(12.83f, 12.82f, 13.3f, 12.74f, 13.639f, 12.98f)
                curveTo(13.91f, 13.17f, 14.269f, 13.17f, 14.54f, 12.99f)
                curveTo(14.88f, 12.76f, 15.349f, 12.84f, 15.58f, 13.19f)
                curveTo(15.809f, 13.53f, 15.729f, 14f, 15.38f, 14.23f)
                curveTo(14.99f, 14.5f, 14.54f, 14.63f, 14.09f, 14.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.09f, 14.63f)
                curveTo(17.619f, 14.63f, 17.16f, 14.49f, 16.77f, 14.21f)
                curveTo(16.43f, 13.97f, 16.35f, 13.5f, 16.59f, 13.16f)
                curveTo(16.83f, 12.82f, 17.299f, 12.74f, 17.639f, 12.98f)
                curveTo(17.91f, 13.17f, 18.27f, 13.17f, 18.539f, 12.99f)
                curveTo(18.879f, 12.76f, 19.35f, 12.84f, 19.58f, 13.19f)
                curveTo(19.809f, 13.53f, 19.729f, 14f, 19.379f, 14.23f)
                curveTo(18.99f, 14.5f, 18.539f, 14.63f, 18.09f, 14.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.001f, 20.17f)
                curveTo(14.101f, 20.17f, 12.551f, 18.62f, 12.551f, 16.72f)
                curveTo(12.551f, 16.01f, 13.131f, 15.43f, 13.841f, 15.43f)
                horizontalLineTo(18.161f)
                curveTo(18.871f, 15.43f, 19.451f, 16.01f, 19.451f, 16.72f)
                curveTo(19.451f, 18.62f, 17.901f, 20.17f, 16.001f, 20.17f)
                close()
                moveTo(14.061f, 16.93f)
                curveTo(14.161f, 17.91f, 14.991f, 18.67f, 16.001f, 18.67f)
                curveTo(17.011f, 18.67f, 17.831f, 17.91f, 17.941f, 16.93f)
                horizontalLineTo(14.061f)
                close()
            }
        }.build()

        return _Smileys!!
    }

@Suppress("ObjectPropertyName")
private var _Smileys: ImageVector? = null
