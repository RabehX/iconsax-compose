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


val Iconsax.Filled.MessageAdd: ImageVector
    get() {
        if (_MessageAdd != null) {
            return _MessageAdd!!
        }
        _MessageAdd = ImageVector.Builder(
            name = "Filled.MessageAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.21f, 13.512f)
                curveTo(4.12f, 13.442f, 3f, 13.842f, 2.17f, 14.672f)
                curveTo(0.61f, 16.232f, 0.61f, 18.762f, 2.17f, 20.332f)
                curveTo(2.7f, 20.862f, 3.35f, 21.212f, 4.04f, 21.382f)
                curveTo(4.42f, 21.482f, 4.82f, 21.512f, 5.22f, 21.492f)
                curveTo(6.17f, 21.452f, 7.1f, 21.072f, 7.83f, 20.342f)
                curveTo(8.86f, 19.312f, 9.21f, 17.862f, 8.88f, 16.552f)
                curveTo(8.72f, 15.862f, 8.36f, 15.212f, 7.83f, 14.682f)
                curveTo(7.11f, 13.952f, 6.17f, 13.562f, 5.21f, 13.512f)
                close()
                moveTo(7.24f, 17.482f)
                curveTo(7.24f, 17.692f, 7.16f, 17.872f, 7.02f, 18.012f)
                curveTo(6.88f, 18.152f, 6.7f, 18.232f, 6.49f, 18.232f)
                horizontalLineTo(5.75f)
                verticalLineTo(19.012f)
                curveTo(5.75f, 19.222f, 5.67f, 19.402f, 5.53f, 19.542f)
                curveTo(5.39f, 19.682f, 5.21f, 19.762f, 5f, 19.762f)
                curveTo(4.59f, 19.762f, 4.25f, 19.422f, 4.25f, 19.012f)
                verticalLineTo(18.232f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 18.232f, 2.75f, 17.892f, 2.75f, 17.482f)
                curveTo(2.75f, 17.072f, 3.09f, 16.732f, 3.5f, 16.732f)
                horizontalLineTo(4.25f)
                verticalLineTo(16.022f)
                curveTo(4.25f, 15.612f, 4.59f, 15.272f, 5f, 15.272f)
                curveTo(5.41f, 15.272f, 5.75f, 15.612f, 5.75f, 16.022f)
                verticalLineTo(16.732f)
                horizontalLineTo(6.49f)
                curveTo(6.91f, 16.732f, 7.24f, 17.072f, 7.24f, 17.482f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.25f, 2.43f)
                horizontalLineTo(7.75f)
                curveTo(4.9f, 2.43f, 3f, 4.33f, 3f, 7.18f)
                verticalLineTo(11.64f)
                curveTo(3f, 11.99f, 3.36f, 12.24f, 3.7f, 12.15f)
                curveTo(4.12f, 12.05f, 4.55f, 12f, 5f, 12f)
                curveTo(7.86f, 12f, 10.22f, 14.32f, 10.48f, 17.13f)
                curveTo(10.5f, 17.41f, 10.73f, 17.63f, 11f, 17.63f)
                horizontalLineTo(11.55f)
                lineTo(15.78f, 20.45f)
                curveTo(16.4f, 20.87f, 17.25f, 20.41f, 17.25f, 19.65f)
                verticalLineTo(17.63f)
                curveTo(18.67f, 17.63f, 19.86f, 17.15f, 20.69f, 16.33f)
                curveTo(21.52f, 15.49f, 22f, 14.3f, 22f, 12.88f)
                verticalLineTo(7.18f)
                curveTo(22f, 4.33f, 20.1f, 2.43f, 17.25f, 2.43f)
                close()
                moveTo(15.83f, 10.81f)
                horizontalLineTo(9.17f)
                curveTo(8.78f, 10.81f, 8.46f, 10.49f, 8.46f, 10.1f)
                curveTo(8.46f, 9.7f, 8.78f, 9.38f, 9.17f, 9.38f)
                horizontalLineTo(15.83f)
                curveTo(16.22f, 9.38f, 16.54f, 9.7f, 16.54f, 10.1f)
                curveTo(16.54f, 10.49f, 16.22f, 10.81f, 15.83f, 10.81f)
                close()
            }
        }.build()

        return _MessageAdd!!
    }

@Suppress("ObjectPropertyName")
private var _MessageAdd: ImageVector? = null
