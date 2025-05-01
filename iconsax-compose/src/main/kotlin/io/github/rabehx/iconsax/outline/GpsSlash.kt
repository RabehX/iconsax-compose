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

val Iconsax.Outline.GpsSlash: ImageVector
    get() {
        if (_GpsSlash != null) {
            return _GpsSlash!!
        }
        _GpsSlash = ImageVector.Builder(
            name = "Outline.GpsSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 20.25f)
                curveTo(10.85f, 20.25f, 9.74f, 20.02f, 8.7f, 19.56f)
                curveTo(8.32f, 19.39f, 8.15f, 18.95f, 8.31f, 18.57f)
                curveTo(8.48f, 18.19f, 8.92f, 18.02f, 9.3f, 18.18f)
                curveTo(10.15f, 18.55f, 11.06f, 18.74f, 12f, 18.74f)
                curveTo(15.72f, 18.74f, 18.75f, 15.71f, 18.75f, 11.99f)
                curveTo(18.75f, 11.05f, 18.56f, 10.14f, 18.19f, 9.29f)
                curveTo(18.02f, 8.91f, 18.2f, 8.47f, 18.58f, 8.3f)
                curveTo(18.96f, 8.14f, 19.4f, 8.31f, 19.57f, 8.69f)
                curveTo(20.03f, 9.73f, 20.26f, 10.84f, 20.26f, 11.99f)
                curveTo(20.25f, 16.55f, 16.55f, 20.25f, 12f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.58f, 17.94f)
                curveTo(6.38f, 17.94f, 6.19f, 17.86f, 6.04f, 17.71f)
                curveTo(4.56f, 16.16f, 3.75f, 14.14f, 3.75f, 12f)
                curveTo(3.75f, 7.45f, 7.45f, 3.75f, 12f, 3.75f)
                curveTo(14.15f, 3.75f, 16.18f, 4.57f, 17.73f, 6.06f)
                curveTo(18.03f, 6.35f, 18.04f, 6.82f, 17.75f, 7.12f)
                curveTo(17.46f, 7.42f, 16.99f, 7.43f, 16.69f, 7.14f)
                curveTo(15.42f, 5.92f, 13.76f, 5.25f, 12f, 5.25f)
                curveTo(8.28f, 5.25f, 5.25f, 8.28f, 5.25f, 12f)
                curveTo(5.25f, 13.75f, 5.92f, 15.41f, 7.13f, 16.67f)
                curveTo(7.42f, 16.97f, 7.41f, 17.44f, 7.11f, 17.73f)
                curveTo(6.96f, 17.87f, 6.77f, 17.94f, 6.58f, 17.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 4.75f)
                curveTo(11.59f, 4.75f, 11.25f, 4.41f, 11.25f, 4f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                verticalLineTo(4f)
                curveTo(12.75f, 4.41f, 12.41f, 4.75f, 12f, 4.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 12.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2f, 11.25f)
                horizontalLineTo(4f)
                curveTo(4.41f, 11.25f, 4.75f, 11.59f, 4.75f, 12f)
                curveTo(4.75f, 12.41f, 4.41f, 12.75f, 4f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(20f)
                curveTo(11.25f, 19.59f, 11.59f, 19.25f, 12f, 19.25f)
                curveTo(12.41f, 19.25f, 12.75f, 19.59f, 12.75f, 20f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 12.75f)
                horizontalLineTo(20f)
                curveTo(19.59f, 12.75f, 19.25f, 12.41f, 19.25f, 12f)
                curveTo(19.25f, 11.59f, 19.59f, 11.25f, 20f, 11.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12f)
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.88f, 14.87f)
                curveTo(9.69f, 14.87f, 9.5f, 14.8f, 9.35f, 14.65f)
                curveTo(8.64f, 13.94f, 8.25f, 13f, 8.25f, 12f)
                curveTo(8.25f, 9.93f, 9.93f, 8.25f, 12f, 8.25f)
                curveTo(13f, 8.25f, 13.94f, 8.64f, 14.65f, 9.35f)
                curveTo(14.94f, 9.64f, 14.94f, 10.12f, 14.65f, 10.41f)
                lineTo(10.41f, 14.65f)
                curveTo(10.26f, 14.8f, 10.07f, 14.87f, 9.88f, 14.87f)
                close()
                moveTo(12f, 9.75f)
                curveTo(10.76f, 9.75f, 9.75f, 10.76f, 9.75f, 12f)
                curveTo(9.75f, 12.34f, 9.83f, 12.67f, 9.97f, 12.97f)
                lineTo(12.97f, 9.97f)
                curveTo(12.67f, 9.83f, 12.34f, 9.75f, 12f, 9.75f)
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

        return _GpsSlash!!
    }

@Suppress("ObjectPropertyName")
private var _GpsSlash: ImageVector? = null
