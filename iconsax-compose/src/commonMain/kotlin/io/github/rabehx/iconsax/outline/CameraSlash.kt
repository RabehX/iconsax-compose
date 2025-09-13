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

val Iconsax.Outline.CameraSlash: ImageVector
    get() {
        if (_CameraSlash != null) {
            return _CameraSlash!!
        }
        _CameraSlash = ImageVector.Builder(
            name = "Outline.CameraSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 10.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 10.75f, 5.25f, 10.41f, 5.25f, 10f)
                curveTo(5.25f, 9.59f, 5.59f, 9.25f, 6f, 9.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 9.25f, 9.75f, 9.59f, 9.75f, 10f)
                curveTo(9.75f, 10.41f, 9.41f, 10.75f, 9f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.24f, 22.75f)
                horizontalLineTo(6.76f)
                curveTo(6.35f, 22.75f, 6.01f, 22.41f, 6.01f, 22f)
                curveTo(6.01f, 21.59f, 6.35f, 21.25f, 6.76f, 21.25f)
                horizontalLineTo(17.24f)
                curveTo(19.26f, 21.25f, 20.35f, 20.22f, 20.48f, 18.2f)
                lineTo(21f, 9.94f)
                curveTo(21.05f, 9.23f, 20.84f, 8.53f, 20.41f, 7.96f)
                curveTo(20.16f, 7.63f, 20.23f, 7.16f, 20.56f, 6.91f)
                curveTo(20.89f, 6.66f, 21.36f, 6.73f, 21.61f, 7.06f)
                curveTo(22.25f, 7.92f, 22.57f, 8.97f, 22.5f, 10.04f)
                lineTo(21.98f, 18.3f)
                curveTo(21.8f, 21.13f, 20.07f, 22.75f, 17.24f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.44f, 21.21f)
                curveTo(3.2f, 21.21f, 2.96f, 21.09f, 2.81f, 20.87f)
                curveTo(2.35f, 20.17f, 2.08f, 19.3f, 2.02f, 18.29f)
                lineTo(1.5f, 10.04f)
                curveTo(1.42f, 8.79f, 1.85f, 7.59f, 2.71f, 6.68f)
                curveTo(3.56f, 5.77f, 4.76f, 5.25f, 6f, 5.25f)
                curveTo(6.32f, 5.25f, 6.63f, 5.06f, 6.78f, 4.76f)
                lineTo(7.5f, 3.33f)
                curveTo(8.09f, 2.16f, 9.57f, 1.25f, 10.86f, 1.25f)
                horizontalLineTo(13.15f)
                curveTo(14.44f, 1.25f, 15.91f, 2.16f, 16.5f, 3.32f)
                lineTo(17.22f, 4.78f)
                curveTo(17.37f, 5.06f, 17.67f, 5.25f, 18f, 5.25f)
                curveTo(18.41f, 5.25f, 18.75f, 5.59f, 18.75f, 6f)
                curveTo(18.75f, 6.41f, 18.41f, 6.75f, 18f, 6.75f)
                curveTo(17.11f, 6.75f, 16.3f, 6.25f, 15.88f, 5.46f)
                lineTo(15.15f, 4f)
                curveTo(14.82f, 3.34f, 13.88f, 2.76f, 13.14f, 2.76f)
                horizontalLineTo(10.85f)
                curveTo(10.11f, 2.76f, 9.17f, 3.34f, 8.83f, 4.01f)
                lineTo(8.12f, 5.44f)
                curveTo(7.7f, 6.25f, 6.89f, 6.75f, 6f, 6.75f)
                curveTo(5.16f, 6.75f, 4.38f, 7.09f, 3.8f, 7.7f)
                curveTo(3.23f, 8.31f, 2.94f, 9.11f, 3f, 9.94f)
                lineTo(3.52f, 18.2f)
                curveTo(3.56f, 18.93f, 3.75f, 19.57f, 4.07f, 20.04f)
                curveTo(4.3f, 20.39f, 4.2f, 20.85f, 3.86f, 21.08f)
                curveTo(3.73f, 21.17f, 3.58f, 21.21f, 3.44f, 21.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(11.11f, 18.75f, 10.24f, 18.45f, 9.54f, 17.9f)
                curveTo(9.21f, 17.64f, 9.16f, 17.17f, 9.41f, 16.85f)
                curveTo(9.67f, 16.52f, 10.14f, 16.47f, 10.46f, 16.72f)
                curveTo(10.9f, 17.06f, 11.44f, 17.25f, 12f, 17.25f)
                curveTo(13.38f, 17.25f, 14.5f, 16.13f, 14.5f, 14.75f)
                curveTo(14.5f, 14.27f, 14.37f, 13.81f, 14.12f, 13.42f)
                curveTo(13.9f, 13.07f, 14f, 12.61f, 14.35f, 12.38f)
                curveTo(14.7f, 12.16f, 15.16f, 12.26f, 15.39f, 12.61f)
                curveTo(15.79f, 13.24f, 16.01f, 13.98f, 16.01f, 14.74f)
                curveTo(16f, 16.96f, 14.21f, 18.75f, 12f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(1.999f, 22.75f)
                curveTo(1.809f, 22.75f, 1.619f, 22.68f, 1.469f, 22.53f)
                curveTo(1.179f, 22.24f, 1.179f, 21.76f, 1.469f, 21.47f)
                lineTo(21.469f, 1.47f)
                curveTo(21.76f, 1.18f, 22.24f, 1.18f, 22.529f, 1.47f)
                curveTo(22.819f, 1.76f, 22.819f, 2.24f, 22.529f, 2.53f)
                lineTo(2.529f, 22.53f)
                curveTo(2.379f, 22.68f, 2.189f, 22.75f, 1.999f, 22.75f)
                close()
            }
        }.build()

        return _CameraSlash!!
    }

@Suppress("ObjectPropertyName")
private var _CameraSlash: ImageVector? = null
