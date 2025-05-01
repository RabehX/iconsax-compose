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


val Iconsax.Filled.MusicPlaylist: ImageVector
    get() {
        if (_MusicPlaylist != null) {
            return _MusicPlaylist!!
        }
        _MusicPlaylist = ImageVector.Builder(
            name = "Filled.MusicPlaylist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(13.909f, 16.211f)
                curveTo(13.569f, 16.211f, 13.289f, 16.491f, 13.289f, 16.831f)
                curveTo(13.289f, 17.171f, 13.569f, 17.451f, 13.909f, 17.451f)
                curveTo(14.249f, 17.451f, 14.529f, 17.171f, 14.529f, 16.831f)
                curveTo(14.529f, 16.491f, 14.249f, 16.211f, 13.909f, 16.211f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.51f, 17.739f)
                curveTo(9.51f, 17.399f, 9.23f, 17.129f, 8.89f, 17.129f)
                curveTo(8.55f, 17.129f, 8.27f, 17.409f, 8.27f, 17.749f)
                curveTo(8.27f, 18.089f, 8.55f, 18.369f, 8.89f, 18.369f)
                curveTo(9.23f, 18.359f, 9.51f, 18.079f, 9.51f, 17.739f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 7f)
                horizontalLineTo(6f)
                curveTo(3.8f, 7f, 2f, 8.8f, 2f, 11f)
                verticalLineTo(18f)
                curveTo(2f, 20.2f, 3.8f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(20.2f, 22f, 22f, 20.2f, 22f, 18f)
                verticalLineTo(11f)
                curveTo(22f, 8.8f, 20.2f, 7f, 18f, 7f)
                close()
                moveTo(16.03f, 12.46f)
                verticalLineTo(16.83f)
                curveTo(16.03f, 16.85f, 16.02f, 16.86f, 16.02f, 16.88f)
                curveTo(15.99f, 18.02f, 15.06f, 18.95f, 13.91f, 18.95f)
                curveTo(12.74f, 18.95f, 11.79f, 18f, 11.79f, 16.83f)
                curveTo(11.79f, 15.66f, 12.74f, 14.71f, 13.91f, 14.71f)
                curveTo(14.13f, 14.71f, 14.33f, 14.75f, 14.53f, 14.81f)
                verticalLineTo(13.44f)
                lineTo(11.01f, 14.4f)
                verticalLineTo(17.73f)
                verticalLineTo(17.74f)
                curveTo(11.01f, 18.91f, 10.06f, 19.86f, 8.89f, 19.86f)
                curveTo(7.72f, 19.86f, 6.77f, 18.91f, 6.77f, 17.74f)
                curveTo(6.77f, 16.57f, 7.72f, 15.62f, 8.89f, 15.62f)
                curveTo(9.11f, 15.62f, 9.31f, 15.66f, 9.51f, 15.72f)
                verticalLineTo(13.82f)
                verticalLineTo(12.22f)
                curveTo(9.51f, 11.33f, 10.06f, 10.61f, 10.91f, 10.39f)
                lineTo(13.64f, 9.64f)
                curveTo(14.52f, 9.41f, 15.06f, 9.64f, 15.37f, 9.88f)
                curveTo(15.67f, 10.11f, 16.03f, 10.58f, 16.03f, 11.47f)
                verticalLineTo(12.46f)
                close()
            }
        }.build()

        return _MusicPlaylist!!
    }

@Suppress("ObjectPropertyName")
private var _MusicPlaylist: ImageVector? = null
