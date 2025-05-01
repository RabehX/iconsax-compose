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

val Iconsax.Outline.Teacher: ImageVector
    get() {
        if (_Teacher != null) {
            return _Teacher!!
        }
        _Teacher = ImageVector.Builder(
            name = "Outline.Teacher",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.01f, 17f)
                curveTo(11.16f, 17f, 10.3f, 16.78f, 9.63f, 16.35f)
                lineTo(3.61f, 12.42f)
                curveTo(2.49f, 11.69f, 1.82f, 10.46f, 1.82f, 9.12f)
                curveTo(1.82f, 7.78f, 2.49f, 6.55f, 3.61f, 5.82f)
                lineTo(9.64f, 1.9f)
                curveTo(10.98f, 1.03f, 13.07f, 1.03f, 14.4f, 1.91f)
                lineTo(20.39f, 5.84f)
                curveTo(21.5f, 6.57f, 22.17f, 7.8f, 22.17f, 9.13f)
                curveTo(22.17f, 10.46f, 21.5f, 11.69f, 20.39f, 12.42f)
                lineTo(14.4f, 16.35f)
                curveTo(13.73f, 16.79f, 12.87f, 17f, 12.01f, 17f)
                close()
                moveTo(12.01f, 2.75f)
                curveTo(11.44f, 2.75f, 10.87f, 2.88f, 10.46f, 3.16f)
                lineTo(4.44f, 7.08f)
                curveTo(3.74f, 7.54f, 3.33f, 8.28f, 3.33f, 9.12f)
                curveTo(3.33f, 9.96f, 3.73f, 10.7f, 4.44f, 11.16f)
                lineTo(10.46f, 15.09f)
                curveTo(11.29f, 15.63f, 12.75f, 15.63f, 13.58f, 15.09f)
                lineTo(19.57f, 11.16f)
                curveTo(20.27f, 10.7f, 20.67f, 9.96f, 20.67f, 9.12f)
                curveTo(20.67f, 8.28f, 20.27f, 7.54f, 19.57f, 7.08f)
                lineTo(13.58f, 3.15f)
                curveTo(13.16f, 2.89f, 12.59f, 2.75f, 12.01f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 22.75f)
                curveTo(11.559f, 22.75f, 11.109f, 22.69f, 10.749f, 22.57f)
                lineTo(7.559f, 21.51f)
                curveTo(6.049f, 21.01f, 4.859f, 19.36f, 4.869f, 17.77f)
                lineTo(4.879f, 13.08f)
                curveTo(4.879f, 12.67f, 5.219f, 12.33f, 5.629f, 12.33f)
                curveTo(6.039f, 12.33f, 6.379f, 12.67f, 6.379f, 13.08f)
                lineTo(6.369f, 17.77f)
                curveTo(6.369f, 18.71f, 7.149f, 19.79f, 8.039f, 20.09f)
                lineTo(11.229f, 21.15f)
                curveTo(11.629f, 21.28f, 12.369f, 21.28f, 12.769f, 21.15f)
                lineTo(15.959f, 20.09f)
                curveTo(16.849f, 19.79f, 17.629f, 18.71f, 17.629f, 17.78f)
                verticalLineTo(13.14f)
                curveTo(17.629f, 12.73f, 17.969f, 12.39f, 18.379f, 12.39f)
                curveTo(18.789f, 12.39f, 19.129f, 12.73f, 19.129f, 13.14f)
                verticalLineTo(17.78f)
                curveTo(19.129f, 19.37f, 17.949f, 21.01f, 16.439f, 21.52f)
                lineTo(13.249f, 22.58f)
                curveTo(12.889f, 22.69f, 12.439f, 22.75f, 11.999f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.4f, 15.75f)
                curveTo(20.99f, 15.75f, 20.65f, 15.41f, 20.65f, 15f)
                verticalLineTo(9f)
                curveTo(20.65f, 8.59f, 20.99f, 8.25f, 21.4f, 8.25f)
                curveTo(21.81f, 8.25f, 22.15f, 8.59f, 22.15f, 9f)
                verticalLineTo(15f)
                curveTo(22.15f, 15.41f, 21.81f, 15.75f, 21.4f, 15.75f)
                close()
            }
        }.build()

        return _Teacher!!
    }

@Suppress("ObjectPropertyName")
private var _Teacher: ImageVector? = null
