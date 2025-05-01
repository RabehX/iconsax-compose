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


val Iconsax.Filled.BookSaved: ImageVector
    get() {
        if (_BookSaved != null) {
            return _BookSaved!!
        }
        _BookSaved = ImageVector.Builder(
            name = "Filled.BookSaved",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.25f, 5.998f)
                verticalLineTo(19.908f)
                curveTo(11.25f, 20.618f, 10.53f, 21.108f, 9.88f, 20.838f)
                curveTo(8.02f, 20.058f, 5.71f, 19.378f, 4.07f, 19.158f)
                lineTo(3.76f, 19.118f)
                curveTo(2.79f, 18.998f, 2f, 18.108f, 2f, 17.138f)
                verticalLineTo(5.248f)
                curveTo(2f, 4.048f, 2.97f, 3.078f, 4.17f, 3.078f)
                horizontalLineTo(4.24f)
                curveTo(6.12f, 3.238f, 8.89f, 4.118f, 10.72f, 5.108f)
                curveTo(11.05f, 5.288f, 11.25f, 5.618f, 11.25f, 5.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.83f, 3.078f)
                horizontalLineTo(19.77f)
                curveTo(19.53f, 3.098f, 19.27f, 3.128f, 19f, 3.178f)
                curveTo(17.77f, 3.378f, 16.31f, 3.798f, 15f, 4.318f)
                curveTo(14.38f, 4.568f, 13.8f, 4.838f, 13.29f, 5.108f)
                curveTo(12.96f, 5.288f, 12.75f, 5.628f, 12.75f, 5.998f)
                verticalLineTo(19.908f)
                curveTo(12.75f, 20.618f, 13.47f, 21.108f, 14.12f, 20.838f)
                curveTo(15.98f, 20.058f, 18.29f, 19.378f, 19.93f, 19.158f)
                lineTo(20.24f, 19.118f)
                curveTo(21.21f, 18.998f, 22f, 18.108f, 22f, 17.138f)
                verticalLineTo(5.248f)
                curveTo(22f, 4.048f, 21.03f, 3.078f, 19.83f, 3.078f)
                close()
                moveTo(19.27f, 13.728f)
                curveTo(19.27f, 14.118f, 18.99f, 14.288f, 18.65f, 14.098f)
                lineTo(17.59f, 13.508f)
                curveTo(17.48f, 13.448f, 17.3f, 13.448f, 17.18f, 13.508f)
                lineTo(16.12f, 14.098f)
                curveTo(15.78f, 14.288f, 15.5f, 14.118f, 15.5f, 13.728f)
                verticalLineTo(10.658f)
                curveTo(15.5f, 10.198f, 15.88f, 9.818f, 16.34f, 9.818f)
                horizontalLineTo(18.44f)
                curveTo(18.9f, 9.818f, 19.28f, 10.198f, 19.28f, 10.658f)
                verticalLineTo(13.728f)
                horizontalLineTo(19.27f)
                close()
            }
        }.build()

        return _BookSaved!!
    }

@Suppress("ObjectPropertyName")
private var _BookSaved: ImageVector? = null
