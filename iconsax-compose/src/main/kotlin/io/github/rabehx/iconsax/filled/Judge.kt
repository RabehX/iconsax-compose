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


val Iconsax.Filled.Judge: ImageVector
    get() {
        if (_Judge != null) {
            return _Judge!!
        }
        _Judge = ImageVector.Builder(
            name = "Filled.Judge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.539f, 19.041f)
                curveTo(20.389f, 19.191f, 20.199f, 19.261f, 20.009f, 19.261f)
                curveTo(19.819f, 19.261f, 19.629f, 19.191f, 19.479f, 19.041f)
                lineTo(14.529f, 14.091f)
                lineTo(15.059f, 13.561f)
                lineTo(15.589f, 13.031f)
                lineTo(20.539f, 17.981f)
                curveTo(20.829f, 18.271f, 20.829f, 18.751f, 20.539f, 19.041f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.469f, 9.278f)
                lineTo(12.269f, 15.078f)
                curveTo(12.659f, 15.468f, 12.659f, 16.098f, 12.269f, 16.488f)
                lineTo(11.369f, 17.398f)
                curveTo(10.559f, 18.198f, 9.279f, 18.198f, 8.479f, 17.398f)
                lineTo(4.139f, 13.058f)
                curveTo(3.349f, 12.268f, 3.349f, 10.978f, 4.139f, 10.178f)
                lineTo(5.049f, 9.268f)
                curveTo(5.439f, 8.888f, 6.079f, 8.888f, 6.469f, 9.278f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.59f, 10.19f)
                lineTo(14.78f, 13.99f)
                curveTo(14.38f, 14.39f, 13.74f, 14.39f, 13.34f, 13.99f)
                lineTo(7.56f, 8.21f)
                curveTo(7.16f, 7.81f, 7.16f, 7.17f, 7.56f, 6.77f)
                lineTo(11.37f, 2.96f)
                curveTo(12.16f, 2.17f, 13.45f, 2.17f, 14.25f, 2.96f)
                lineTo(18.59f, 7.3f)
                curveTo(19.38f, 8.1f, 19.38f, 9.38f, 18.59f, 10.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 21.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 21.75f, 1.25f, 21.41f, 1.25f, 21f)
                curveTo(1.25f, 20.59f, 1.59f, 20.25f, 2f, 20.25f)
                horizontalLineTo(8f)
                curveTo(8.41f, 20.25f, 8.75f, 20.59f, 8.75f, 21f)
                curveTo(8.75f, 21.41f, 8.41f, 21.75f, 8f, 21.75f)
                close()
            }
        }.build()

        return _Judge!!
    }

@Suppress("ObjectPropertyName")
private var _Judge: ImageVector? = null
