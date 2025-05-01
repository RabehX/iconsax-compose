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


val Iconsax.Filled.Blur: ImageVector
    get() {
        if (_Blur != null) {
            return _Blur!!
        }
        _Blur = ImageVector.Builder(
            name = "Filled.Blur",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.47f, 7.412f)
                lineTo(15.93f, 6.202f)
                curveTo(16.23f, 6.052f, 16.31f, 5.662f, 16.08f, 5.422f)
                curveTo(15.19f, 4.442f, 14.29f, 3.622f, 13.57f, 3.002f)
                curveTo(13.24f, 2.722f, 12.75f, 2.952f, 12.75f, 3.382f)
                verticalLineTo(6.962f)
                curveTo(12.75f, 7.332f, 13.14f, 7.572f, 13.47f, 7.412f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 19.738f)
                verticalLineTo(21.388f)
                curveTo(12.75f, 21.688f, 13.02f, 21.938f, 13.32f, 21.888f)
                curveTo(16.05f, 21.438f, 18.33f, 19.608f, 19.41f, 17.148f)
                curveTo(19.6f, 16.728f, 19.14f, 16.308f, 18.72f, 16.508f)
                lineTo(13.03f, 19.298f)
                curveTo(12.86f, 19.378f, 12.75f, 19.548f, 12.75f, 19.738f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.25f, 3.362f)
                curveTo(11.25f, 2.932f, 10.76f, 2.702f, 10.431f, 2.972f)
                curveTo(8.07f, 4.952f, 3.88f, 9.122f, 3.9f, 13.902f)
                curveTo(3.9f, 17.922f, 6.84f, 21.252f, 10.681f, 21.892f)
                curveTo(10.981f, 21.942f, 11.25f, 21.692f, 11.25f, 21.392f)
                verticalLineTo(3.362f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.44f, 12.471f)
                lineTo(18.73f, 10.251f)
                curveTo(19f, 10.131f, 19.13f, 9.821f, 19f, 9.561f)
                curveTo(18.63f, 8.831f, 18.2f, 8.121f, 17.73f, 7.461f)
                curveTo(17.59f, 7.261f, 17.33f, 7.201f, 17.11f, 7.301f)
                lineTo(13.02f, 9.291f)
                curveTo(12.85f, 9.371f, 12.74f, 9.551f, 12.74f, 9.741f)
                verticalLineTo(12.011f)
                curveTo(12.75f, 12.361f, 13.11f, 12.611f, 13.44f, 12.471f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.83f, 14.311f)
                curveTo(19.99f, 14.231f, 20.09f, 14.081f, 20.09f, 13.911f)
                curveTo(20.09f, 13.271f, 20.01f, 12.641f, 19.87f, 12.021f)
                curveTo(19.8f, 11.721f, 19.47f, 11.561f, 19.19f, 11.681f)
                lineTo(13.05f, 14.301f)
                curveTo(12.87f, 14.381f, 12.75f, 14.561f, 12.75f, 14.761f)
                verticalLineTo(16.961f)
                curveTo(12.75f, 17.331f, 13.14f, 17.571f, 13.47f, 17.411f)
                lineTo(19.37f, 14.541f)
                lineTo(19.83f, 14.311f)
                close()
            }
        }.build()

        return _Blur!!
    }

@Suppress("ObjectPropertyName")
private var _Blur: ImageVector? = null
