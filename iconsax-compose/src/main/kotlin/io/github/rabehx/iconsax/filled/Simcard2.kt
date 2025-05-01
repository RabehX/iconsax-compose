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


val Iconsax.Filled.Simcard2: ImageVector
    get() {
        if (_Simcard2 != null) {
            return _Simcard2!!
        }
        _Simcard2 = ImageVector.Builder(
            name = "Filled.Simcard2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 12.692f)
                verticalLineTo(18.082f)
                curveTo(16f, 20.422f, 14.44f, 21.972f, 12.11f, 21.972f)
                horizontalLineTo(5.89f)
                curveTo(3.56f, 21.972f, 2f, 20.422f, 2f, 18.082f)
                verticalLineTo(10.312f)
                curveTo(2f, 7.972f, 3.56f, 6.422f, 5.89f, 6.422f)
                horizontalLineTo(9.72f)
                curveTo(10.75f, 6.422f, 11.74f, 6.832f, 12.47f, 7.562f)
                lineTo(14.86f, 9.942f)
                curveTo(15.59f, 10.672f, 16f, 11.662f, 16f, 12.692f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 8.249f)
                verticalLineTo(13.639f)
                curveTo(22f, 15.969f, 20.44f, 17.529f, 18.11f, 17.529f)
                horizontalLineTo(17f)
                verticalLineTo(12.689f)
                curveTo(17f, 11.399f, 16.479f, 10.139f, 15.569f, 9.229f)
                lineTo(13.179f, 6.849f)
                curveTo(12.269f, 5.939f, 11.009f, 5.419f, 9.72f, 5.419f)
                horizontalLineTo(8.02f)
                curveTo(8.2f, 3.339f, 9.71f, 1.969f, 11.889f, 1.969f)
                horizontalLineTo(15.719f)
                curveTo(16.75f, 1.969f, 17.74f, 2.379f, 18.469f, 3.109f)
                lineTo(20.86f, 5.499f)
                curveTo(21.59f, 6.229f, 22f, 7.219f, 22f, 8.249f)
                close()
            }
        }.build()

        return _Simcard2!!
    }

@Suppress("ObjectPropertyName")
private var _Simcard2: ImageVector? = null
