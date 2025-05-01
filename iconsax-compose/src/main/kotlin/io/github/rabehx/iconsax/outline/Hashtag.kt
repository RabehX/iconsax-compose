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

val Iconsax.Outline.Hashtag: ImageVector
    get() {
        if (_Hashtag != null) {
            return _Hashtag!!
        }
        _Hashtag = ImageVector.Builder(
            name = "Outline.Hashtag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.999f, 21.75f)
                curveTo(7.969f, 21.75f, 7.939f, 21.75f, 7.919f, 21.75f)
                curveTo(7.509f, 21.7f, 7.209f, 21.33f, 7.259f, 20.92f)
                lineTo(9.259f, 2.92f)
                curveTo(9.309f, 2.51f, 9.679f, 2.22f, 10.089f, 2.26f)
                curveTo(10.499f, 2.31f, 10.799f, 2.68f, 10.749f, 3.09f)
                lineTo(8.749f, 21.09f)
                curveTo(8.699f, 21.47f, 8.379f, 21.75f, 7.999f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.999f, 21.75f)
                curveTo(13.969f, 21.75f, 13.939f, 21.75f, 13.919f, 21.75f)
                curveTo(13.509f, 21.7f, 13.209f, 21.33f, 13.259f, 20.92f)
                lineTo(15.259f, 2.92f)
                curveTo(15.309f, 2.51f, 15.669f, 2.22f, 16.089f, 2.26f)
                curveTo(16.499f, 2.31f, 16.799f, 2.68f, 16.749f, 3.09f)
                lineTo(14.749f, 21.09f)
                curveTo(14.699f, 21.47f, 14.379f, 21.75f, 13.999f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.5f, 9.75f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 9.75f, 2.75f, 9.41f, 2.75f, 9f)
                curveTo(2.75f, 8.59f, 3.09f, 8.25f, 3.5f, 8.25f)
                horizontalLineTo(21.5f)
                curveTo(21.91f, 8.25f, 22.25f, 8.59f, 22.25f, 9f)
                curveTo(22.25f, 9.41f, 21.91f, 9.75f, 21.5f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 15.75f)
                horizontalLineTo(2.5f)
                curveTo(2.09f, 15.75f, 1.75f, 15.41f, 1.75f, 15f)
                curveTo(1.75f, 14.59f, 2.09f, 14.25f, 2.5f, 14.25f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 14.25f, 21.25f, 14.59f, 21.25f, 15f)
                curveTo(21.25f, 15.41f, 20.91f, 15.75f, 20.5f, 15.75f)
                close()
            }
        }.build()

        return _Hashtag!!
    }

@Suppress("ObjectPropertyName")
private var _Hashtag: ImageVector? = null
