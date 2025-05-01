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

val Iconsax.Outline.MusicPlaylist: ImageVector
    get() {
        if (_MusicPlaylist != null) {
            return _MusicPlaylist!!
        }
        _MusicPlaylist = ImageVector.Builder(
            name = "Outline.MusicPlaylist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(7f)
                curveTo(3.35f, 22.75f, 1.25f, 20.65f, 1.25f, 17f)
                verticalLineTo(12f)
                curveTo(1.25f, 8.35f, 3.35f, 6.25f, 7f, 6.25f)
                horizontalLineTo(17f)
                curveTo(20.65f, 6.25f, 22.75f, 8.35f, 22.75f, 12f)
                verticalLineTo(17f)
                curveTo(22.75f, 20.65f, 20.65f, 22.75f, 17f, 22.75f)
                close()
                moveTo(7f, 7.75f)
                curveTo(4.14f, 7.75f, 2.75f, 9.14f, 2.75f, 12f)
                verticalLineTo(17f)
                curveTo(2.75f, 19.86f, 4.14f, 21.25f, 7f, 21.25f)
                horizontalLineTo(17f)
                curveTo(19.86f, 21.25f, 21.25f, 19.86f, 21.25f, 17f)
                verticalLineTo(12f)
                curveTo(21.25f, 9.14f, 19.86f, 7.75f, 17f, 7.75f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 5.25f)
                horizontalLineTo(6f)
                curveTo(5.59f, 5.25f, 5.25f, 4.91f, 5.25f, 4.5f)
                curveTo(5.25f, 4.09f, 5.59f, 3.75f, 6f, 3.75f)
                horizontalLineTo(18f)
                curveTo(18.41f, 3.75f, 18.75f, 4.09f, 18.75f, 4.5f)
                curveTo(18.75f, 4.91f, 18.41f, 5.25f, 18f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 2.75f, 8.25f, 2.41f, 8.25f, 2f)
                curveTo(8.25f, 1.59f, 8.59f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 1.25f, 15.75f, 1.59f, 15.75f, 2f)
                curveTo(15.75f, 2.41f, 15.41f, 2.75f, 15f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.89f, 19.86f)
                curveTo(7.72f, 19.86f, 6.77f, 18.91f, 6.77f, 17.74f)
                curveTo(6.77f, 16.57f, 7.72f, 15.62f, 8.89f, 15.62f)
                curveTo(10.059f, 15.62f, 11.009f, 16.57f, 11.009f, 17.74f)
                curveTo(11.009f, 18.91f, 10.059f, 19.86f, 8.89f, 19.86f)
                close()
                moveTo(8.89f, 17.12f)
                curveTo(8.55f, 17.12f, 8.27f, 17.4f, 8.27f, 17.74f)
                curveTo(8.27f, 18.08f, 8.55f, 18.36f, 8.89f, 18.36f)
                curveTo(9.23f, 18.36f, 9.51f, 18.08f, 9.51f, 17.74f)
                curveTo(9.51f, 17.4f, 9.23f, 17.12f, 8.89f, 17.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.26f, 18.49f)
                curveTo(9.85f, 18.49f, 9.51f, 18.15f, 9.51f, 17.74f)
                verticalLineTo(12.23f)
                curveTo(9.51f, 11.35f, 10.06f, 10.64f, 10.9f, 10.41f)
                lineTo(13.64f, 9.66f)
                curveTo(14.51f, 9.42f, 15.06f, 9.65f, 15.36f, 9.89f)
                curveTo(15.66f, 10.12f, 16.02f, 10.59f, 16.02f, 11.48f)
                verticalLineTo(16.83f)
                curveTo(16.02f, 17.24f, 15.68f, 17.58f, 15.27f, 17.58f)
                curveTo(14.86f, 17.58f, 14.52f, 17.24f, 14.52f, 16.83f)
                verticalLineTo(11.48f)
                curveTo(14.52f, 11.2f, 14.46f, 11.09f, 14.44f, 11.08f)
                curveTo(14.42f, 11.07f, 14.3f, 11.03f, 14.02f, 11.11f)
                lineTo(11.29f, 11.86f)
                curveTo(11.04f, 11.93f, 11f, 12.1f, 11f, 12.24f)
                verticalLineTo(17.75f)
                curveTo(11.01f, 18.15f, 10.67f, 18.49f, 10.26f, 18.49f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.909f, 18.95f)
                curveTo(12.739f, 18.95f, 11.789f, 18f, 11.789f, 16.83f)
                curveTo(11.789f, 15.66f, 12.739f, 14.71f, 13.909f, 14.71f)
                curveTo(15.079f, 14.71f, 16.029f, 15.66f, 16.029f, 16.83f)
                curveTo(16.029f, 18f, 15.079f, 18.95f, 13.909f, 18.95f)
                close()
                moveTo(13.909f, 16.21f)
                curveTo(13.569f, 16.21f, 13.289f, 16.49f, 13.289f, 16.83f)
                curveTo(13.289f, 17.17f, 13.569f, 17.45f, 13.909f, 17.45f)
                curveTo(14.249f, 17.45f, 14.529f, 17.17f, 14.529f, 16.83f)
                curveTo(14.529f, 16.49f, 14.249f, 16.21f, 13.909f, 16.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.26f, 14.58f)
                curveTo(9.93f, 14.58f, 9.63f, 14.36f, 9.54f, 14.03f)
                curveTo(9.43f, 13.63f, 9.67f, 13.22f, 10.07f, 13.11f)
                lineTo(15.08f, 11.74f)
                curveTo(15.49f, 11.63f, 15.89f, 11.87f, 16f, 12.27f)
                curveTo(16.11f, 12.67f, 15.87f, 13.08f, 15.47f, 13.19f)
                lineTo(10.46f, 14.56f)
                curveTo(10.39f, 14.57f, 10.33f, 14.58f, 10.26f, 14.58f)
                close()
            }
        }.build()

        return _MusicPlaylist!!
    }

@Suppress("ObjectPropertyName")
private var _MusicPlaylist: ImageVector? = null
