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


val Iconsax.Filled.FilterRemove: ImageVector
    get() {
        if (_FilterRemove != null) {
            return _FilterRemove!!
        }
        _FilterRemove = ImageVector.Builder(
            name = "Filled.FilterRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.881f, 10f)
                curveTo(14.261f, 10f, 12.131f, 12.13f, 12.131f, 14.75f)
                curveTo(12.131f, 15.64f, 12.381f, 16.48f, 12.821f, 17.2f)
                curveTo(13.641f, 18.58f, 15.151f, 19.5f, 16.881f, 19.5f)
                curveTo(18.611f, 19.5f, 20.121f, 18.57f, 20.941f, 17.2f)
                curveTo(21.381f, 16.49f, 21.631f, 15.64f, 21.631f, 14.75f)
                curveTo(21.631f, 12.13f, 19.511f, 10f, 16.881f, 10f)
                close()
                moveTo(18.681f, 16.52f)
                curveTo(18.531f, 16.67f, 18.341f, 16.74f, 18.151f, 16.74f)
                curveTo(17.961f, 16.74f, 17.771f, 16.67f, 17.621f, 16.52f)
                lineTo(16.901f, 15.8f)
                lineTo(16.151f, 16.55f)
                curveTo(16.001f, 16.7f, 15.811f, 16.77f, 15.621f, 16.77f)
                curveTo(15.431f, 16.77f, 15.241f, 16.7f, 15.091f, 16.55f)
                curveTo(14.801f, 16.26f, 14.801f, 15.78f, 15.091f, 15.49f)
                lineTo(15.841f, 14.74f)
                lineTo(15.121f, 14.01f)
                curveTo(14.831f, 13.72f, 14.831f, 13.24f, 15.121f, 12.95f)
                curveTo(15.411f, 12.66f, 15.891f, 12.66f, 16.181f, 12.95f)
                lineTo(16.901f, 13.67f)
                lineTo(17.601f, 12.97f)
                curveTo(17.891f, 12.68f, 18.371f, 12.68f, 18.661f, 12.97f)
                curveTo(18.951f, 13.26f, 18.951f, 13.74f, 18.661f, 14.03f)
                lineTo(17.961f, 14.73f)
                lineTo(18.681f, 15.46f)
                curveTo(18.981f, 15.75f, 18.981f, 16.23f, 18.681f, 16.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.58f, 4.02f)
                verticalLineTo(6.24f)
                curveTo(20.58f, 7.05f, 20.08f, 8.06f, 19.58f, 8.57f)
                lineTo(19.4f, 8.73f)
                curveTo(19.26f, 8.86f, 19.05f, 8.89f, 18.87f, 8.83f)
                curveTo(18.67f, 8.76f, 18.47f, 8.71f, 18.27f, 8.66f)
                curveTo(17.83f, 8.55f, 17.36f, 8.5f, 16.88f, 8.5f)
                curveTo(13.43f, 8.5f, 10.63f, 11.3f, 10.63f, 14.75f)
                curveTo(10.63f, 15.89f, 10.94f, 17.01f, 11.53f, 17.97f)
                curveTo(12.03f, 18.81f, 12.73f, 19.51f, 13.49f, 19.98f)
                curveTo(13.72f, 20.13f, 13.81f, 20.45f, 13.61f, 20.63f)
                curveTo(13.54f, 20.69f, 13.47f, 20.74f, 13.4f, 20.79f)
                lineTo(12f, 21.7f)
                curveTo(10.7f, 22.51f, 8.91f, 21.6f, 8.91f, 19.98f)
                verticalLineTo(14.63f)
                curveTo(8.91f, 13.92f, 8.51f, 13.01f, 8.11f, 12.51f)
                lineTo(4.32f, 8.47f)
                curveTo(3.82f, 7.96f, 3.42f, 7.05f, 3.42f, 6.45f)
                verticalLineTo(4.12f)
                curveTo(3.42f, 2.91f, 4.32f, 2f, 5.41f, 2f)
                horizontalLineTo(18.59f)
                curveTo(19.68f, 2f, 20.58f, 2.91f, 20.58f, 4.02f)
                close()
            }
        }.build()

        return _FilterRemove!!
    }

@Suppress("ObjectPropertyName")
private var _FilterRemove: ImageVector? = null
