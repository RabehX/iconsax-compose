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


val Iconsax.Filled.LikeTag: ImageVector
    get() {
        if (_LikeTag != null) {
            return _LikeTag!!
        }
        _LikeTag = ImageVector.Builder(
            name = "Filled.LikeTag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                curveTo(4.34f, 2f, 3f, 3.33f, 3f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(3f, 17.52f, 4.34f, 18.85f, 6f, 18.85f)
                horizontalLineTo(6.76f)
                curveTo(7.56f, 18.85f, 8.32f, 19.16f, 8.88f, 19.72f)
                lineTo(10.59f, 21.41f)
                curveTo(11.37f, 22.18f, 12.64f, 22.18f, 13.42f, 21.41f)
                lineTo(15.13f, 19.72f)
                curveTo(15.69f, 19.16f, 16.46f, 18.85f, 17.25f, 18.85f)
                horizontalLineTo(18f)
                curveTo(19.66f, 18.85f, 21f, 17.52f, 21f, 15.88f)
                verticalLineTo(4.97f)
                curveTo(21f, 3.33f, 19.66f, 2f, 18f, 2f)
                close()
                moveTo(16.68f, 10.5f)
                lineTo(15.51f, 14.06f)
                curveTo(15.36f, 14.65f, 14.73f, 15.13f, 14.09f, 15.13f)
                horizontalLineTo(12.24f)
                curveTo(11.92f, 15.13f, 11.47f, 15.02f, 11.27f, 14.82f)
                lineTo(9.8f, 13.67f)
                curveTo(9.77f, 14.31f, 9.48f, 14.58f, 8.77f, 14.58f)
                horizontalLineTo(8.29f)
                curveTo(7.55f, 14.58f, 7.25f, 14.29f, 7.25f, 13.59f)
                verticalLineTo(8.82f)
                curveTo(7.25f, 8.12f, 7.55f, 7.83f, 8.29f, 7.83f)
                horizontalLineTo(8.78f)
                curveTo(9.52f, 7.83f, 9.82f, 8.12f, 9.82f, 8.82f)
                verticalLineTo(9.18f)
                lineTo(11.76f, 6.3f)
                curveTo(11.96f, 5.99f, 12.47f, 5.77f, 12.9f, 5.94f)
                curveTo(13.37f, 6.1f, 13.67f, 6.62f, 13.57f, 7.08f)
                lineTo(13.33f, 8.64f)
                curveTo(13.3f, 8.77f, 13.33f, 8.91f, 13.42f, 9f)
                curveTo(13.5f, 9.09f, 13.62f, 9.15f, 13.75f, 9.15f)
                horizontalLineTo(15.7f)
                curveTo(16.08f, 9.15f, 16.4f, 9.3f, 16.59f, 9.57f)
                curveTo(16.77f, 9.83f, 16.8f, 10.16f, 16.68f, 10.5f)
                close()
            }
        }.build()

        return _LikeTag!!
    }

@Suppress("ObjectPropertyName")
private var _LikeTag: ImageVector? = null
