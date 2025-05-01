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

val Iconsax.Filled.Arrow2: ImageVector
    get() {
        if (_Arrow2 != null) {
            return _Arrow2!!
        }
        _Arrow2 = ImageVector.Builder(
            name = "Filled.Arrow2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.75f, 6.729f)
                curveTo(21.75f, 6.529f, 21.67f, 6.339f, 21.53f, 6.199f)
                lineTo(17.81f, 2.479f)
                curveTo(17.52f, 2.189f, 17.04f, 2.189f, 16.75f, 2.479f)
                curveTo(16.46f, 2.769f, 16.46f, 3.249f, 16.75f, 3.539f)
                lineTo(19.2f, 5.989f)
                horizontalLineTo(3f)
                curveTo(2.59f, 5.989f, 2.25f, 6.329f, 2.25f, 6.739f)
                curveTo(2.25f, 7.149f, 2.59f, 7.479f, 3f, 7.479f)
                horizontalLineTo(19.19f)
                lineTo(16.75f, 9.919f)
                curveTo(16.46f, 10.209f, 16.46f, 10.689f, 16.75f, 10.979f)
                curveTo(16.9f, 11.129f, 17.09f, 11.199f, 17.28f, 11.199f)
                curveTo(17.47f, 11.199f, 17.66f, 11.129f, 17.81f, 10.979f)
                lineTo(21.52f, 7.269f)
                curveTo(21.59f, 7.199f, 21.65f, 7.109f, 21.69f, 7.009f)
                curveTo(21.69f, 6.999f, 21.69f, 6.989f, 21.7f, 6.979f)
                curveTo(21.73f, 6.899f, 21.75f, 6.819f, 21.75f, 6.729f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 16.518f)
                horizontalLineTo(4.81f)
                lineTo(7.25f, 14.078f)
                curveTo(7.54f, 13.788f, 7.54f, 13.308f, 7.25f, 13.018f)
                curveTo(6.96f, 12.728f, 6.48f, 12.728f, 6.19f, 13.018f)
                lineTo(2.48f, 16.728f)
                curveTo(2.41f, 16.798f, 2.35f, 16.888f, 2.31f, 16.988f)
                curveTo(2.31f, 16.998f, 2.31f, 17.008f, 2.3f, 17.018f)
                curveTo(2.27f, 17.098f, 2.25f, 17.188f, 2.25f, 17.278f)
                curveTo(2.25f, 17.478f, 2.33f, 17.668f, 2.47f, 17.808f)
                lineTo(6.19f, 21.528f)
                curveTo(6.34f, 21.678f, 6.53f, 21.748f, 6.72f, 21.748f)
                curveTo(6.91f, 21.748f, 7.1f, 21.678f, 7.25f, 21.528f)
                curveTo(7.54f, 21.238f, 7.54f, 20.758f, 7.25f, 20.468f)
                lineTo(4.8f, 18.018f)
                horizontalLineTo(21f)
                curveTo(21.41f, 18.018f, 21.75f, 17.678f, 21.75f, 17.268f)
                curveTo(21.75f, 16.858f, 21.41f, 16.518f, 21f, 16.518f)
                close()
            }
        }.build()

        return _Arrow2!!
    }

@Suppress("ObjectPropertyName")
private var _Arrow2: ImageVector? = null
