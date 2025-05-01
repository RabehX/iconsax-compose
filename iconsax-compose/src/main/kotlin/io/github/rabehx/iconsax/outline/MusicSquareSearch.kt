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

val Iconsax.Outline.MusicSquareSearch: ImageVector
    get() {
        if (_MusicSquareSearch != null) {
            return _MusicSquareSearch!!
        }
        _MusicSquareSearch = ImageVector.Builder(
            name = "Outline.MusicSquareSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.35f, 21.75f)
                horizontalLineTo(8.65f)
                curveTo(3.46f, 21.75f, 1.25f, 19.54f, 1.25f, 14.35f)
                verticalLineTo(8.65f)
                curveTo(1.25f, 3.46f, 3.46f, 1.25f, 8.65f, 1.25f)
                horizontalLineTo(14.35f)
                curveTo(19.54f, 1.25f, 21.75f, 3.46f, 21.75f, 8.65f)
                verticalLineTo(12.35f)
                curveTo(21.75f, 12.76f, 21.41f, 13.1f, 21f, 13.1f)
                curveTo(20.59f, 13.1f, 20.25f, 12.76f, 20.25f, 12.35f)
                verticalLineTo(8.65f)
                curveTo(20.25f, 4.29f, 18.71f, 2.75f, 14.35f, 2.75f)
                horizontalLineTo(8.65f)
                curveTo(4.29f, 2.75f, 2.75f, 4.29f, 2.75f, 8.65f)
                verticalLineTo(14.35f)
                curveTo(2.75f, 18.71f, 4.29f, 20.25f, 8.65f, 20.25f)
                horizontalLineTo(12.35f)
                curveTo(12.76f, 20.25f, 13.1f, 20.59f, 13.1f, 21f)
                curveTo(13.1f, 21.41f, 12.76f, 21.75f, 12.35f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.72f, 15.17f)
                curveTo(5.51f, 15.17f, 4.52f, 14.18f, 4.52f, 12.97f)
                curveTo(4.52f, 11.76f, 5.51f, 10.77f, 6.72f, 10.77f)
                curveTo(7.93f, 10.77f, 8.92f, 11.76f, 8.92f, 12.97f)
                curveTo(8.92f, 14.18f, 7.93f, 15.17f, 6.72f, 15.17f)
                close()
                moveTo(6.72f, 12.27f)
                curveTo(6.34f, 12.27f, 6.02f, 12.58f, 6.02f, 12.97f)
                curveTo(6.02f, 13.35f, 6.33f, 13.67f, 6.72f, 13.67f)
                curveTo(7.11f, 13.67f, 7.42f, 13.36f, 7.42f, 12.97f)
                curveTo(7.42f, 12.58f, 7.11f, 12.27f, 6.72f, 12.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.17f, 13.72f)
                curveTo(7.76f, 13.72f, 7.42f, 13.38f, 7.42f, 12.97f)
                verticalLineTo(7.14f)
                curveTo(7.42f, 6.23f, 7.99f, 5.49f, 8.86f, 5.25f)
                lineTo(11.76f, 4.46f)
                curveTo(12.66f, 4.21f, 13.23f, 4.45f, 13.54f, 4.69f)
                curveTo(13.85f, 4.93f, 14.23f, 5.41f, 14.23f, 6.34f)
                verticalLineTo(12f)
                curveTo(14.23f, 12.41f, 13.89f, 12.75f, 13.48f, 12.75f)
                curveTo(13.07f, 12.75f, 12.73f, 12.41f, 12.73f, 12f)
                verticalLineTo(6.34f)
                curveTo(12.73f, 6.02f, 12.66f, 5.9f, 12.63f, 5.88f)
                curveTo(12.6f, 5.86f, 12.46f, 5.82f, 12.15f, 5.9f)
                lineTo(9.26f, 6.69f)
                curveTo(8.96f, 6.77f, 8.92f, 6.98f, 8.92f, 7.13f)
                verticalLineTo(12.96f)
                curveTo(8.92f, 13.38f, 8.58f, 13.72f, 8.17f, 13.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.03f, 14.2f)
                curveTo(10.82f, 14.2f, 9.83f, 13.21f, 9.83f, 12f)
                curveTo(9.83f, 10.79f, 10.82f, 9.8f, 12.03f, 9.8f)
                curveTo(13.24f, 9.8f, 14.23f, 10.79f, 14.23f, 12f)
                curveTo(14.23f, 13.22f, 13.24f, 14.2f, 12.03f, 14.2f)
                close()
                moveTo(12.03f, 11.31f)
                curveTo(11.65f, 11.31f, 11.33f, 11.62f, 11.33f, 12.01f)
                curveTo(11.33f, 12.39f, 11.64f, 12.71f, 12.03f, 12.71f)
                curveTo(12.42f, 12.71f, 12.73f, 12.4f, 12.73f, 12.01f)
                curveTo(12.73f, 11.62f, 12.41f, 11.31f, 12.03f, 11.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.171f, 9.58f)
                curveTo(7.841f, 9.58f, 7.541f, 9.36f, 7.451f, 9.03f)
                curveTo(7.341f, 8.63f, 7.581f, 8.22f, 7.981f, 8.11f)
                lineTo(13.29f, 6.66f)
                curveTo(13.691f, 6.56f, 14.101f, 6.79f, 14.211f, 7.19f)
                curveTo(14.321f, 7.59f, 14.08f, 8f, 13.681f, 8.11f)
                lineTo(8.371f, 9.56f)
                curveTo(8.301f, 9.57f, 8.231f, 9.58f, 8.171f, 9.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.94f, 22.03f)
                curveTo(15.76f, 22.03f, 13.99f, 20.26f, 13.99f, 18.08f)
                curveTo(13.99f, 15.9f, 15.76f, 14.13f, 17.94f, 14.13f)
                curveTo(20.12f, 14.13f, 21.89f, 15.9f, 21.89f, 18.08f)
                curveTo(21.89f, 20.26f, 20.12f, 22.03f, 17.94f, 22.03f)
                close()
                moveTo(17.94f, 15.63f)
                curveTo(16.59f, 15.63f, 15.49f, 16.73f, 15.49f, 18.08f)
                curveTo(15.49f, 19.43f, 16.59f, 20.53f, 17.94f, 20.53f)
                curveTo(19.29f, 20.53f, 20.39f, 19.43f, 20.39f, 18.08f)
                curveTo(20.39f, 16.73f, 19.29f, 15.63f, 17.94f, 15.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.74f, 22.63f)
                curveTo(21.55f, 22.63f, 21.36f, 22.56f, 21.21f, 22.41f)
                lineTo(20.21f, 21.41f)
                curveTo(19.92f, 21.12f, 19.92f, 20.64f, 20.21f, 20.35f)
                curveTo(20.5f, 20.06f, 20.98f, 20.06f, 21.27f, 20.35f)
                lineTo(22.27f, 21.35f)
                curveTo(22.56f, 21.64f, 22.56f, 22.12f, 22.27f, 22.41f)
                curveTo(22.12f, 22.55f, 21.93f, 22.63f, 21.74f, 22.63f)
                close()
            }
        }.build()

        return _MusicSquareSearch!!
    }

@Suppress("ObjectPropertyName")
private var _MusicSquareSearch: ImageVector? = null
