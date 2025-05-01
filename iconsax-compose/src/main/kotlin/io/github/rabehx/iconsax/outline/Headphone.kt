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

val Iconsax.Outline.Headphone: ImageVector
    get() {
        if (_Headphone != null) {
            return _Headphone!!
        }
        _Headphone = ImageVector.Builder(
            name = "Outline.Headphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.57f, 22.7f)
                curveTo(3.23f, 22.7f, 1.25f, 20.72f, 1.25f, 18.38f)
                verticalLineTo(12.22f)
                curveTo(1.2f, 9.3f, 2.28f, 6.55f, 4.3f, 4.49f)
                curveTo(6.32f, 2.44f, 9.03f, 1.3f, 11.95f, 1.3f)
                curveTo(17.91f, 1.3f, 22.75f, 6.15f, 22.75f, 12.1f)
                verticalLineTo(18.26f)
                curveTo(22.75f, 20.64f, 20.81f, 22.58f, 18.43f, 22.58f)
                curveTo(16.09f, 22.58f, 14.11f, 20.6f, 14.11f, 18.26f)
                verticalLineTo(15.45f)
                curveTo(14.11f, 14f, 15.25f, 12.86f, 16.7f, 12.86f)
                curveTo(18.15f, 12.86f, 19.29f, 14f, 19.29f, 15.45f)
                verticalLineTo(18.48f)
                curveTo(19.29f, 18.89f, 18.95f, 19.23f, 18.54f, 19.23f)
                curveTo(18.13f, 19.23f, 17.79f, 18.89f, 17.79f, 18.48f)
                verticalLineTo(15.45f)
                curveTo(17.79f, 14.77f, 17.24f, 14.36f, 16.7f, 14.36f)
                curveTo(16.02f, 14.36f, 15.61f, 14.91f, 15.61f, 15.45f)
                verticalLineTo(18.26f)
                curveTo(15.61f, 19.79f, 16.9f, 21.08f, 18.43f, 21.08f)
                curveTo(19.96f, 21.08f, 21.25f, 19.79f, 21.25f, 18.26f)
                verticalLineTo(12.1f)
                curveTo(21.25f, 6.97f, 17.08f, 2.8f, 11.95f, 2.8f)
                curveTo(9.44f, 2.8f, 7.11f, 3.77f, 5.37f, 5.54f)
                curveTo(3.63f, 7.31f, 2.7f, 9.68f, 2.75f, 12.2f)
                verticalLineTo(18.38f)
                curveTo(2.75f, 19.91f, 4.04f, 21.2f, 5.57f, 21.2f)
                curveTo(7.1f, 21.2f, 8.39f, 19.91f, 8.39f, 18.38f)
                verticalLineTo(15.57f)
                curveTo(8.39f, 14.89f, 7.84f, 14.48f, 7.3f, 14.48f)
                curveTo(6.62f, 14.48f, 6.21f, 15.03f, 6.21f, 15.57f)
                verticalLineTo(18.49f)
                curveTo(6.21f, 18.9f, 5.87f, 19.24f, 5.46f, 19.24f)
                curveTo(5.05f, 19.24f, 4.71f, 18.9f, 4.71f, 18.49f)
                verticalLineTo(15.57f)
                curveTo(4.71f, 14.12f, 5.85f, 12.98f, 7.3f, 12.98f)
                curveTo(8.75f, 12.98f, 9.89f, 14.12f, 9.89f, 15.57f)
                verticalLineTo(18.38f)
                curveTo(9.89f, 20.72f, 7.91f, 22.7f, 5.57f, 22.7f)
                close()
            }
        }.build()

        return _Headphone!!
    }

@Suppress("ObjectPropertyName")
private var _Headphone: ImageVector? = null
