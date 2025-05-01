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


val Iconsax.Filled.HomeHashtag: ImageVector
    get() {
        if (_HomeHashtag != null) {
            return _HomeHashtag!!
        }
        _HomeHashtag = ImageVector.Builder(
            name = "Filled.HomeHashtag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.699f, 16.88f)
                horizontalLineTo(13.399f)
                curveTo(14.549f, 16.88f, 15.489f, 15.94f, 15.489f, 14.79f)
                verticalLineTo(14.09f)
                horizontalLineTo(12.699f)
                verticalLineTo(16.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.51f, 14.79f)
                curveTo(8.51f, 15.94f, 9.45f, 16.88f, 10.6f, 16.88f)
                horizontalLineTo(11.3f)
                verticalLineTo(14.09f)
                horizontalLineTo(8.51f)
                verticalLineTo(14.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.51f, 12f)
                verticalLineTo(12.7f)
                horizontalLineTo(11.3f)
                verticalLineTo(9.91f)
                horizontalLineTo(10.6f)
                curveTo(9.45f, 9.91f, 8.51f, 10.85f, 8.51f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.03f, 6.822f)
                lineTo(14.28f, 2.792f)
                curveTo(12.71f, 1.692f, 10.31f, 1.752f, 8.8f, 2.922f)
                lineTo(3.79f, 6.832f)
                curveTo(2.78f, 7.612f, 2f, 9.212f, 2f, 10.472f)
                verticalLineTo(17.372f)
                curveTo(2f, 19.922f, 4.07f, 22.002f, 6.61f, 22.002f)
                horizontalLineTo(17.38f)
                curveTo(19.92f, 22.002f, 21.99f, 19.932f, 21.99f, 17.382f)
                verticalLineTo(10.602f)
                curveTo(22f, 9.252f, 21.13f, 7.592f, 20.03f, 6.822f)
                close()
                moveTo(16.88f, 14.792f)
                curveTo(16.88f, 16.712f, 15.31f, 18.282f, 13.39f, 18.282f)
                horizontalLineTo(10.6f)
                curveTo(8.68f, 18.282f, 7.11f, 16.722f, 7.11f, 14.792f)
                verticalLineTo(12.002f)
                curveTo(7.11f, 10.082f, 8.68f, 8.512f, 10.6f, 8.512f)
                horizontalLineTo(13.39f)
                curveTo(15.31f, 8.512f, 16.88f, 10.072f, 16.88f, 12.002f)
                verticalLineTo(14.792f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.399f, 9.91f)
                horizontalLineTo(12.699f)
                verticalLineTo(12.7f)
                horizontalLineTo(15.489f)
                verticalLineTo(12f)
                curveTo(15.489f, 10.85f, 14.549f, 9.91f, 13.399f, 9.91f)
                close()
            }
        }.build()

        return _HomeHashtag!!
    }

@Suppress("ObjectPropertyName")
private var _HomeHashtag: ImageVector? = null
